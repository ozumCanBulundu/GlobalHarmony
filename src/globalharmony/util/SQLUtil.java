/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.util;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ozumc
 */
public class SQLUtil {
    private Connection sqlConnection;
    private Statement sqlStatement;

    public SQLUtil() {
        String url = "jdbc:mysql://localhost:3306/musicdb";
        String username = "root";
        String password = "root";
        
        try {
            sqlConnection = DriverManager.getConnection(url, username, password);
            sqlStatement = sqlConnection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        
        return sqlConnection;
    }
    
    public Statement getStatement(){
        
        return sqlStatement;
    }
    
    public void closeConnection(){
        
        try {
            sqlConnection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public int executeUpdate(String cmd){
        try {
            this.sqlStatement.executeUpdate(cmd);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public ResultSet executeQuery(String cmd){
        try {
            return this.sqlStatement.executeQuery(cmd);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
