package com.example;

import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.axis2.AxisFault;

public class CalculateurAireClient {

	static int getAireTriangle(int h, int b) {

		try {
			CalculateurAireServiceStub stub = new CalculateurAireServiceStub();

			com.example.CalculateurAireServiceStub.GetAireTriangle req = new com.example.CalculateurAireServiceStub.GetAireTriangle();
			req.setBase(b);
			req.setHauteur(h);
			com.example.CalculateurAireServiceStub.GetAireTriangleResponse res = stub.getAireTriangle(req);
			return res.get_return();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	static int getAireRectangle(int h, int l) {
		try {
			CalculateurAireServiceStub stub = new CalculateurAireServiceStub();
			com.example.CalculateurAireServiceStub.GetAireRectangle req = new com.example.CalculateurAireServiceStub.GetAireRectangle();
			req.setLargeur(l);
			req.setHauteur(h);
			com.example.CalculateurAireServiceStub.GetAireRectangleResponse res = stub.getAireRectangle(req);
			return res.get_return();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	static int getAireCarre(int l) {
		try {
			CalculateurAireServiceStub stub = new CalculateurAireServiceStub();
			com.example.CalculateurAireServiceStub.GetAireCarre req = new com.example.CalculateurAireServiceStub.GetAireCarre();
			req.setLongeur(l);
			com.example.CalculateurAireServiceStub.GetAireCarreResponse res = stub.getAireCarre(req);
			return res.get_return();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
