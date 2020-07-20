package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search {
    private JTextField txtName;
    private JButton btnSearch;
    private JPanel rootPanel;


    public Search() {
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                Result frm = new Result(name);

                frm.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Search");
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Search().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
