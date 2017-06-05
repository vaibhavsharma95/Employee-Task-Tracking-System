/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Mohammad Sanaullah
 */
public class To_Connect {
    public Connection con;
    public Statement stat;
    public ResultSet res;
    
    public To_Connect(){
        systemConnection();
    }
    
    public void systemConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/etts","root","");
            stat = (Statement)con.createStatement();
            System.out.println("Connected");
        } catch (Exception e) {
        }
    }
    
    
}
