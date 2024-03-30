// UserService.java
package com.yourpackage.service;

import com.yourpackage.model.User;
import com.yourpackage.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    private static final String GET_USER_QUERY = "SELECT * FROM users WHERE user_id=?";
    private static final String UPDATE_BALANCE_QUERY = "UPDATE users SET balance=? WHERE user_id=?";

    public User getUser(String userId) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_QUERY)) {

            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new User(resultSet.getString("user_id"), resultSet.getDouble("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void updateBalance(String userId, double newBalance) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BALANCE_QUERY)) {

            preparedStatement.setDouble(1, newBalance);
            preparedStatement.setString(2, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
