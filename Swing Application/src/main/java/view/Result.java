package view;
import model.Employee;
import model.EmployeeDB;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Result extends JFrame {
    private JPanel rootPanel;
    private JList list1;
    private JLabel txtIsEmpty;
    private JLabel lbTitle;

    private void initComponents() {
        setTitle("Kết quả:");
        this.setLocationRelativeTo(null);
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public Result(String name) {
        initComponents();
        lbTitle.setText("Kết quả tìm nhân viên: " +name);
        loadListEmployee(name);

    }

    private void loadListEmployee(String name) {
        EmployeeDB dao = new EmployeeDB();
        try{
            ArrayList<Employee> list = dao.findEmployeeByName(name);
            if(list.size()>0)
                fillListEmployee(list);
            else{
                txtIsEmpty.setText("Không tìm thấy thông tin");

            }

        }
        catch(IOException e){
            txtIsEmpty.setText("Không tìm thấy thông tin");
        }
    }

    private void fillListEmployee(ArrayList<Employee> list) {
        DefaultListModel model = new DefaultListModel();

        for(Employee e:list){
            model.addElement(e);
        }

        list1.setModel(model);
    }
}
