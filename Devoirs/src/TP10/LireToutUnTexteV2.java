package TP10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LireToutUnTexteV2 extends BufferedReader{
	
	String ligne = null;
	String Stexte = "";
	
	public LireToutUnTexteV2(FileReader fr) {
		super(fr);
	}
	
	public void afficher() {
		System.out.println(Stexte);
	}
}