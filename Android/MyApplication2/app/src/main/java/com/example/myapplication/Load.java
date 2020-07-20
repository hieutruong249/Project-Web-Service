package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Load extends AppCompatActivity {
    TextView textView;
    TextView result;
    ListView listView;
    final ArrayList<Employee> listEmployee = new ArrayList<>();
    String name ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        Intent i = getIntent();
        name = i.getStringExtra("tenNV");

        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.listView);

        textView.setText("Kết quả tìm nhân viên: " + name);
        GetData();

    }

    public void SetData(){
        if(listEmployee.size()>0){
            ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, listEmployee);
            listView.setAdapter(adapter);
        }
        else {
            result = findViewById(R.id.result);
            result.setText("Không có dữ liệu...");
        }

    }

    public void GetData(){
        AsyncHttpClient client = new AsyncHttpClient ();

        client.get("http://10.0.2.2:8080/WebAPI/findEmployeeByName?ten="+name,null,new AsyncHttpResponseHandler(){

            @Override
            public void onSuccess(String content) {

                try {
                    JSONArray obj = new JSONArray(content);

                    for (int i = 0; i < obj.length(); i++) {
                        Employee e = new Employee();
                        e.setHonv(obj.getJSONObject(i).getString("honv"));
                        e.setTenlot(obj.getJSONObject(i).getString("tenlot"));
                        e.setTennv(obj.getJSONObject(i).getString("tennv"));
                        e.setManv(obj.getJSONObject(i).getString("manv"));
                        e.setNgsinh(obj.getJSONObject(i).getString("ngsinh"));
                        e.setDchi(obj.getJSONObject(i).getString("dchi"));
                        e.setLuong(obj.getJSONObject(i).getDouble("luong"));
                        e.setPhai(obj.getJSONObject(i).getString("phai"));
                        e.setMa_nql(obj.getJSONObject(i).getString("ma_nql"));
                        e.setPhg(obj.getJSONObject(i).getString("phg"));
                        listEmployee.add(e);
                    }


                } catch (JSONException e) {
                }
                SetData();

            }

            @Override
            public void onFailure(Throwable error) {

            }

        });
    }


}