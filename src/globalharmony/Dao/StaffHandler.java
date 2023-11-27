/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Dao;

import globalharmony.Bo.User;
import globalharmony.util.SQLUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ozumc
 */
public class StaffHandler {
    
    private SQLUtil sQLUtil;
    
    public StaffHandler(){
        sQLUtil = new SQLUtil();
    }
    
    public User login(String username, String password){
        User user = null;

        try {
            String cmd = String.format("SELECT name,Id,userName,password FROM User WHERE username='%s' and password ='%s'",username,password);
            ResultSet rs = sQLUtil.executeQuery(cmd);
            while(rs.next()){
                //get info
                int id = rs.getInt("Id");
                String name = rs.getString("name");
                user = new User(name, id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
