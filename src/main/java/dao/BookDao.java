package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.h2.tools.Server;

import entities.Book;

public class Bookdao {
	
    private String jdbcUrl = "jdbc:h2:tcp://localhost/~/test";
    private String user = "sa";
    private String password = "";

    public void addBook(Book book) throws ClassNotFoundException {
        try {
        	Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        	
        	String sql = "INSERT INTO books VALUES ('0', ?, ?, ?)";
        	
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getDescription());
            preparedStatement.setBoolean(4, book.getAvailability());
            int rows = preparedStatement.executeUpdate();
            
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAllBooks() throws ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try {
        	Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                Boolean availability = resultSet.getBoolean("availability");
                books.add(new Book(id, title, description, availability));
            }
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
