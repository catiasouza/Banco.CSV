package com.teste.catia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File arquivo = new File ("arquivo.CSV");
 
  
 try {
	
	 
	 FileReader ler = new FileReader(arquivo);
	 BufferedReader lerb = new BufferedReader(ler);
	 String linha = lerb.readLine();
	 
	 while(linha != null) {
		 System.out.println(linha);
		 linha = lerb.readLine();
	 }
	 
	 
 }catch(IOException ex) {
	 
 }
 
	}

}
