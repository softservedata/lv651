package com.softserve.edu.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project {
    private JTextField txtGas;
    private JTextField txtWater;
    private JTextField txtEnergy;
    private JTextField txtgPrice;
    private JTextField txtwPrice;
    private JTextField txtePrice;
    private JTextField txtSum;
    private JButton calculateButton;
    private JPanel Main;


    public static void main() {
        JFrame frame = new JFrame("Project");
        frame.setContentPane(new Project().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Project() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
