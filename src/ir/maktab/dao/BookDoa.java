package ir.maktab.dao;

import ir.maktab.model.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDoa extends BaseDao {

    public BookDoa() throws ClassNotFoundException, SQLException {
    }

    public List<Book> readAllBookFromDoa() throws SQLException {
        List<Book> books = new ArrayList<>();
        if (getConnection() != null) {
            String sql = "SELECT * FROM books";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book(resultSet.getInt("id"), resultSet.getString("authorName")
                        , resultSet.getString("ISBN"), resultSet.getString("bookTitle"), resultSet.getInt("publishedYear")
                        , resultSet.getLong("price"), resultSet.getInt("soldNumber"));
                books.add(book);
            }
        }
        return books;
    }
}
