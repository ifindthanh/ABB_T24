package com.securemetric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
    public static void saveResult(long timestamp, String value) throws ClassNotFoundException {
        Class.forName ("com.mysql.jdbc.Driver"); 
        Connection connection = null;
        try {
            connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/test?UseUnicode=true&amp;characterEncoding=utf8", "root","123456");
            Statement st = connection.createStatement(); 
            
            String sql = "CREATE TABLE IF NOT EXISTS ABB_RESULT " +
                    "(id BIGINT not NULL, " +
                    " value VARCHAR(255), PRIMARY KEY (id));";

            st.executeUpdate(sql);
            String saveResultSQL = "INSERT INTO ABB_RESULT (id, value) VALUES (?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(saveResultSQL);
            preparedStatement.setLong(1, timestamp);
            preparedStatement.setString(2, value);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    
                }
            }
        }
        
    }
}
