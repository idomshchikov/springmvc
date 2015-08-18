package com.lviv.igor.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Config {

    public void go() {

        try {
            Class.forName("org.h2.Driver");

            Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            System.out.println("Connection success");
            
            String sql = "select * from user where first_name = first_name";
            PreparedStatement pr = con.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            if(rs.next())
                System.out.println(rs.getString("first_name"));
                System.out.println(rs.getString("last_name"));
            
            
        } catch (Exception e) {
            System.out.println("Connection refuesd");
        }

    }

}
