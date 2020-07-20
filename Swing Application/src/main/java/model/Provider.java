package model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Provider {
    private static  final String hostName = "localhost";
    private static  final String port = "8080";
    private static  final String webAPIName = "WebAPI";

    private static HttpURLConnection conn;

    public static HttpURLConnection getConnection(String servletName) throws MalformedURLException, IOException {

        URL url = new URL("http://"+hostName+":"+port+"/"+webAPIName+"/"+ servletName);
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        //System.out.println("Ket noi thanh cong");

        return conn;
    }

    public static HttpURLConnection getConnection(String servletName, String method) throws MalformedURLException, IOException{

        URL url = new URL("http://"+hostName+":"+port+"/"+webAPIName+"/"+ servletName);
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        //System.out.println("Ket noi thanh cong");

        return conn;
    }

    public void closeConnection() {
        if(conn!=null){
            try {
                conn.disconnect();
                //System.out.println("Dong ket noi thanh cong\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
