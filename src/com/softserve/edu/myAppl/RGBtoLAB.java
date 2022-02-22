package com.softserve.edu.myAppl;

//http://www.brucelindbloom.com
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBtoLAB implements ActionListener {

	int l = 0;
	int a = 0;
	int b1 = 0;
	double r0, g0, b0, r, g, b, X, Y, Z, fx, fy, fz, xr, yr, zr;
	double Ls, as, bs;
	double eps = 216 / 24389;
	double k = 24389 / 27;

	double Xr = 0.950467; // reference white D50
	double Yr = 1.0;
	double Zr = 1.0888;

	JFrame frame;
	JSpinner textfield1;
	JSpinner textfield2;
	JSpinner textfield3;

	JTextField textfield4;
	JTextField textfield5;
	JTextField textfield6;

	JButton clrButton;
	JButton equButton;
	JPanel panel;
	
	JLabel labelTask =  new JLabel();
	JLabel labelR = new JLabel();
	JLabel labelG = new JLabel();
	JLabel labelB = new JLabel();
	JLabel labelL = new JLabel();
	JLabel labela = new JLabel();
	JLabel labelb = new JLabel();

	Font myFont = new Font("Continuum Medium", Font.BOLD + Font.ITALIC, 25);
	Font myFont1 = new Font("Continuum Medium", Font.BOLD, 25);
	
	
	int numR = 0, numG = 0, numB = 0, result = 0;

	RGBtoLAB() {

		frame = new JFrame("sRGB to CIELAB");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(440, 550);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(null);
		frame.setResizable(false);

		SpinnerModel value1 =  new SpinnerNumberModel(0, 0, 255, 1);
		SpinnerModel value2 =  new SpinnerNumberModel(0, 0, 255, 1);
		SpinnerModel value3 =  new SpinnerNumberModel(0, 0, 255, 1);
		
		textfield1 = new JSpinner(value1);
		textfield1.setBounds(50, 125, 100, 50);
		textfield1.setFont(myFont1);
	

		textfield2 = new JSpinner(value2);
		textfield2.setBounds(160, 125, 100, 50);
		textfield2.setFont(myFont1);
	

		textfield3 = new JSpinner(value3);
		textfield3.setBounds(270, 125, 100, 50);
		textfield3.setFont(myFont1);
	

		textfield4 = new JTextField();
		textfield4.setHorizontalAlignment(JTextField.RIGHT);
		textfield4.setBounds(50, 200, 100, 50);
		textfield4.setFont(myFont1);
		textfield4.setEditable(false);

		textfield5 = new JTextField();
		textfield5.setHorizontalAlignment(JTextField.RIGHT);
		textfield5.setBounds(160, 200, 100, 50);
		textfield5.setFont(myFont1);
		textfield5.setEditable(false);

		textfield6 = new JTextField();
		textfield6.setHorizontalAlignment(JTextField.RIGHT);
		textfield6.setBounds(270, 200, 100, 50);
		textfield6.setFont(myFont1);
		textfield6.setEditable(false);
		
		
		labelTask.setBounds(50, 15, 1000, 50);
		labelTask.setBackground(new Color(50, 50, 50));
		labelTask.setForeground(new Color(255, 255, 255));
		labelTask.setFont(new Font("Continuum Medium", Font.BOLD, 14));


		labelR.setBounds(80, 75, 100, 50);
		labelR.setBackground(new Color(50, 50, 50));
		labelR.setForeground(new Color(255, 255, 255));
		labelR.setFont(myFont);

		labelG.setBounds(190, 75, 100, 50);
		labelG.setBackground(new Color(50, 50, 50));
		labelG.setForeground(new Color(255, 255, 255));
		labelG.setFont(myFont);

		labelB.setBounds(300, 75, 100, 50);
		labelB.setBackground(new Color(50, 50, 50));
		labelB.setForeground(new Color(255, 255, 255));
		labelB.setFont(myFont);

		labelL.setBounds(80, 250, 100, 50);
		labelL.setBackground(new Color(50, 50, 50));
		labelL.setForeground(new Color(255, 255, 255));
		labelL.setFont(myFont);

		labela.setBounds(190, 250, 100, 50);
		labela.setBackground(new Color(50, 50, 50));
		labela.setForeground(new Color(255, 255, 255));
		labela.setFont(myFont);

		labelb.setBounds(300, 250, 100, 50);
		labelb.setBackground(new Color(50, 50, 50));
		labelb.setForeground(new Color(255, 255, 255));
		labelb.setFont(myFont);

		
		labelTask.setText("Enter values for an RGB to convert it to CIELa*b*");
		labelR.setText("R");
		labelG.setText("G");
		labelB.setText("B");
		labelL.setText("L*");
		labela.setText("a*");
		labelb.setText("b*");

		equButton = new JButton("=");
		clrButton = new JButton("Clear");

		equButton.addActionListener(this);
		clrButton.addActionListener(this);

		clrButton.setBounds(50, 400, 100, 50);
		equButton.setBounds(250, 400, 100, 50);
		clrButton.setFont(myFont);
		equButton.setFont(myFont);

		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));

		// frame.add(panel);
		frame.add(equButton);
		frame.add(clrButton);
		frame.add(textfield1);
		frame.add(textfield2);
		frame.add(textfield3);
		frame.add(textfield4);
		frame.add(textfield5);
		frame.add(textfield6);
		frame.add(labelTask);
		frame.add(labelR);
		frame.add(labelG);
		frame.add(labelB);
		frame.add(labelL);
		frame.add(labela);
		frame.add(labelb);

		frame.setVisible(true);
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == clrButton) {
			
		
			textfield1.setValue(0);
			textfield2.setValue(0);
			textfield3.setValue(0);
			textfield4.setText("");
			textfield5.setText("");
			textfield6.setText("");
			
			
			
			labelR.setForeground(new Color(255, 255, 255));
			labelG.setForeground(new Color(255, 255, 255));
			labelB.setForeground(new Color(255, 255, 255));
			labelL.setForeground(new Color(255, 255, 255));
			labela.setForeground(new Color(255, 255, 255));
			labelb.setForeground(new Color(255, 255, 255));
			
		}

		if (e.getSource() == equButton) {

	
		numR = (int) (textfield1.getValue());
		numG = (int) (textfield2.getValue());
		numB = (int) (textfield3.getValue());

	
		Color color = new Color(numR, numG, numB);{
		labelR.setForeground(color);
		labelB.setForeground(color);
		labelG.setForeground(color);
		labelL.setForeground(color);
		labela.setForeground(color);
		labelb.setForeground(color);
		}
		
		
		
		// RGB to XYZ

		r0 = (double) numR / 255; // R 0..1
		g0 = (double) numG / 255; // G 0..1
		b0 = (double) numB / 255; // B 0..1
		System.out.println("r=" + r0 + ",g=" + g0 + "b=" + b0);

		r = Math.pow(r0, 2.2);
		g = Math.pow(g0, 2.2);
		b = Math.pow(b0, 2.2);

		System.out.println("r=" + r + ",g=" + g + "b=" + b);

		// assuming sRGB (D65)

		X = 0.5767309 * r + 0.185554 * g + 0.1881852 * b;
		Y = 0.2973769 * r + 0.6273491 * g + 0.0752741 * b;
		Z = 0.0270343 * r + 0.0706872 * g + 0.9911088 * b;
		System.out.println("X=" + X + ",Y=" + Y + "Z=" + Z);

		// XYZ to Lab
		xr = X / Xr;
		yr = Y / Yr;
		zr = Z / Zr;
		System.out.println("xr=" + xr + ",yr=" + yr + "zr=" + zr);

		if (xr > eps)
			fx = Math.pow(xr, 1 / 3.);

		else
			fx = ((k * xr + 16) / 116);

		if (yr > eps)
			fy = Math.pow(yr, 1 / 3.);
		else
			fy = ((k * yr + 16) / 116);

		if (zr > eps)
			fz = Math.pow(zr, 1 / 3.);
		else
			fz = ((k * zr + 16) / 116);

		System.out.println("fx=" + fx + ",fy=" + fy + ",fz=" + fz);

		Ls = (116 * fy) - 16;
		as = 500 * (fx - fy);
		bs = 200 * (fy - fz);
		System.out.println("Ls=" + Ls + ", as=" + as + ", bs=" + bs);

		l = (int) Ls;
		a = (int) as;
		b1 = (int) bs;
		System.out.println("L=" + l + ", a=" + a + ", b=" + b1);

		textfield4.setText(String.valueOf(l));
		textfield5.setText(String.valueOf(a));
		textfield6.setText(String.valueOf(b1));
		}
	}



	
	public static void main(String[] args) {

		RGBtoLAB calc = new RGBtoLAB();
	}





	

}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	


