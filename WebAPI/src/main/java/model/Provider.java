package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Provider {
    private static  final String hostName = "localhost";
    private static  final String userName = "root";
    private static  final String passWord = "";
    private static  final String dbName = "qldact";
    private static  final String connectionUrl =  "jdbc:mysql://" + hostName + ":3306/" + dbName + "?zeroDateTimeBehavior=convertToNull";

    private static Connection conn;
    public static Connection getConnection(){
        if(conn!=null){
            return conn;
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(connectionUrl, userName, passWord);
                System.out.println("Ket noi thanh cong");
                return conn;
            } catch(Exception e){
                System.out.println("Ket noi that bai");
                e.printStackTrace();
            }
        }

        return null;
    }

    public void closeConnection() {
        if(conn!=null){
            try {
                conn.close();
                System.out.println("Dong ket noi thanh cong\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally{
                conn = null;
            }
        }

    }

    public ResultSet excuteQuery(String sql){
        ResultSet rs = null;
        try{
            Statement sm = getConnection().createStatement();
            rs = sm.executeQuery(sql);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return rs;
    }
}
