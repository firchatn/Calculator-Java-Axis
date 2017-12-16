package com.example;

public class CalculateurAireService {

	public int getAireRectangle(int largeur, int hauteur) {
		return largeur * hauteur;
	}
	
	public int getAireCarre(int longeur) {
		return longeur * longeur;
	}
	
	public int getAireTriangle(int hauteur, int base) {
		return (hauteur * base) / 2;
	}
}
