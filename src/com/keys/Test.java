package com.keys;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","12");
            System.out.println("Connected to database");
        }catch(Exception e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
