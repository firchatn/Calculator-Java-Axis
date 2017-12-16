package com.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculateurAire extends JFrame {
	static CalculateurAire theCalculateurAire;

	JPanel pnPanel0;
	JTextField tfRHauteur;
	JTextField tfTHauteur;
	JTextField tfRLargeur;
	JTextField tfTBase;
	JButton tbtRCalculer;
	JButton tbtTCalculer;
	JLabel lbRRes;
	JLabel lbTRes;
	JLabel lbLabel3;
	JTextField tfCLargeur;
	JButton tbtCCalculer;
	JLabel lbCRes;
	JLabel lbLabel4;
	JLabel lbLabel5;

	/**
	 */
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (UnsupportedLookAndFeelException e) {
		}
		theCalculateurAire = new CalculateurAire();
	}

	/**
	 */
	public CalculateurAire() {
		super("Calculateur Aire");

		pnPanel0 = new JPanel();
		GridBagLayout gbPanel0 = new GridBagLayout();
		GridBagConstraints gbcPanel0 = new GridBagConstraints();
		pnPanel0.setLayout(gbPanel0);

		
		lbLabel3 = new JLabel("Rectangle");
		gbcPanel0.gridx = 0;
		gbcPanel0.gridy = 0;
		gbPanel0.setConstraints(lbLabel3, gbcPanel0);
		pnPanel0.add(lbLabel3);
		
		lbLabel4 = new JLabel("Triangle");
		gbcPanel0.gridx = 1;
		gbcPanel0.gridy = 0;
		gbPanel0.setConstraints(lbLabel4, gbcPanel0);
		pnPanel0.add(lbLabel4);
		
		lbLabel5 = new JLabel("Carre");
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 0;
		gbPanel0.setConstraints(lbLabel5, gbcPanel0);
		pnPanel0.add(lbLabel5);
		
		
		
		
		tfRHauteur = new JTextField();
		gbcPanel0.gridx = 0;
		gbcPanel0.gridy = 1;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbPanel0.setConstraints(tfRHauteur, gbcPanel0);
		pnPanel0.add(tfRHauteur);

		tfTHauteur = new JTextField();
		gbcPanel0.gridx = 1;
		gbcPanel0.gridy = 1;
		gbPanel0.setConstraints(tfTHauteur, gbcPanel0);
		pnPanel0.add(tfTHauteur);
		
		tfCLargeur = new JTextField();
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 1;
		gbPanel0.setConstraints(tfCLargeur, gbcPanel0);
		pnPanel0.add(tfCLargeur);

		
		
		
		tfRLargeur = new JTextField();
		gbcPanel0.gridx = 0;
		gbcPanel0.gridy = 2;
		gbPanel0.setConstraints(tfRLargeur, gbcPanel0);
		pnPanel0.add(tfRLargeur);

		tfTBase = new JTextField();
		gbcPanel0.gridx = 1;
		gbcPanel0.gridy = 2;
		gbPanel0.setConstraints(tfTBase, gbcPanel0);
		pnPanel0.add(tfTBase);

		
		
		tbtRCalculer = new JButton("Calculer");
		tbtRCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbRRes.setText(String.valueOf(
						CalculateurAireClient.getAireRectangle(
								Integer.valueOf(tfRHauteur.getText()),
								Integer.valueOf(tfRLargeur.getText()))));
			}
		});
		gbcPanel0.gridx = 0;
		gbcPanel0.gridy = 3;
		gbPanel0.setConstraints(tbtRCalculer, gbcPanel0);
		pnPanel0.add(tbtRCalculer);

		tbtTCalculer = new JButton("Calculer");
		tbtTCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbTRes.setText(String.valueOf(
						CalculateurAireClient.getAireTriangle(
								Integer.valueOf(tfTHauteur.getText()),
								Integer.valueOf(tfTBase.getText()))));
			}
		});
		gbcPanel0.gridx = 1;
		gbcPanel0.gridy = 3;
		gbPanel0.setConstraints(tbtTCalculer, gbcPanel0);
		pnPanel0.add(tbtTCalculer);
		
		tbtCCalculer = new JButton("Calculer");
		tbtCCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbCRes.setText(String.valueOf(
						CalculateurAireClient.getAireCarre(
								Integer.valueOf(tfCLargeur.getText()))));
			}
		});
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 3;
		gbPanel0.setConstraints(tbtCCalculer, gbcPanel0);
		pnPanel0.add(tbtCCalculer);

		
		
		
		lbRRes = new JLabel(" ");
		gbcPanel0.gridx = 0;
		gbcPanel0.gridy = 4;
		gbPanel0.setConstraints(lbRRes, gbcPanel0);
		pnPanel0.add(lbRRes);

		lbTRes = new JLabel(" ");
		gbcPanel0.gridx = 1;
		gbcPanel0.gridy = 4;
		gbPanel0.setConstraints(lbTRes, gbcPanel0);
		pnPanel0.add(lbTRes);

		lbCRes = new JLabel(" ");
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 4;
		gbPanel0.setConstraints(lbCRes, gbcPanel0);
		pnPanel0.add(lbCRes);

		
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setContentPane(pnPanel0);
		pack();
		setVisible(true);
	}
}
