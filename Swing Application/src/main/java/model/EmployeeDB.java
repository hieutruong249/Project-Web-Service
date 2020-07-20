package model;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class EmployeeDB {

    public ArrayList<Employee> findEmployeeByName(String name)throws MalformedURLException, IOException {
        ArrayList<Employee> list = new ArrayList();

        String temp = name.replaceAll(" ", "%20");
        //System.out.println(temp);

        Provider util = new Provider();
        String url = String.format("findEmployeeByName?ten=%s", temp);
        HttpURLConnection con = util.getConnection(url);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine = "";
        Employee[] arr = null;
        while ((inputLine = in.readLine()) != null) {
            //List<nhanvien> arr = new Gson().fromJson(inputLine, new TypeToken<List<nhanvien>>(){}.getType());
            arr = new Gson().fromJson(inputLine, Employee[].class);

        }
        in.close();
        util.closeConnection();

        for(Employee i:arr){
            String str = new Gson().toJson(i);
            Employee nv = parse2Employee(str);
            list.add(nv);
        }

        return list;

    }

    public Employee parse2Employee(String input){
        Employee nv = new Employee();

        Gson gson = new Gson();
        nv = gson.fromJson(input, Employee.class);

        return nv;
    }


}
