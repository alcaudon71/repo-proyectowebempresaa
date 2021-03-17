package com.ust.web.defecto;

public class QuitarEspacioString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringConEspacio = "Nº 1(ARM.16 PARA TRANSPORTE)\r\n" + 
				"\r\n" + 
				"HOLA                                                ";
		
		String stringSinEspacio = "";
		
		stringSinEspacio = stringConEspacio.replaceAll("\n", "");
		
		String stringSinEspacio2 = stringConEspacio.replaceAll("[\n\r]","");
		
		System.out.println(stringSinEspacio);
		
		System.out.println(" * * * * * * ");
		
		System.out.println(stringSinEspacio2);
		
				
		
	}

}
