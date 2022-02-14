package com.softserve.edu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cars {
    private JTextField txtModel;
    private JTextField txtBought;
    private JTextField txtInvstd;
    private JTextField txtLiquids;
    private JTextField txtSold;
    private JTextField txtEarnings;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cars");
        frame.setContentPane(new Cars().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Cars() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double bought,invstd,expences,sold,earnings;
                bought = Double.parseDouble(txtBought.getText());
                invstd =Double.parseDouble(txtInvstd.getText());
                expences = Double.parseDouble(txtLiquids.getText());
                sold = Double.parseDouble(txtSold.getText());
                earnings = sold - (bought+invstd+expences);

                txtEarnings.setText(String.valueOf(earnings));

            }
        });
    }
}
