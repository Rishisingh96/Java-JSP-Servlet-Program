package com.servlet;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/todo";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Rishi@9838";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> todoList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String action = request.getParameter("action");

            if (action != null) {
                if (action.equals("add")) {
                    String todoItem = request.getParameter("todoItem");
                    if (todoItem != null && !todoItem.isEmpty()) {
                        insertTodoItem(connection, todoItem);
                    }
                } else if (action.equals("delete")) {
                    int id = Integer.parseInt(request.getParameter("id"));
                    deleteTodoItem(connection, id);
                }
            }

            todoList = retrieveTodoItems(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("todoList", todoList);
        request.getRequestDispatcher("todo.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void insertTodoItem(Connection connection, String todoItem) throws SQLException {
        String sql = "INSERT INTO todos (item) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, todoItem);
            statement.executeUpdate();
        }
    }

    private void deleteTodoItem(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM todos WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    private ArrayList<String> retrieveTodoItems(Connection connection) throws SQLException {
        ArrayList<String> todoList = new ArrayList<>();
        String sql = "SELECT * FROM todos";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String todoItem = resultSet.getString("item");
                todoList.add(todoItem);
            }
        }
        return todoList;
    }
}
