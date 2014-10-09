package edu.upc.eetac.dsa.rlorenzo.Ejercicio8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Dato {
	
	int entero;
	String cadena;
	char caracter;
	
	public Dato(int entero, String cadena, char caracter){
		
		this.entero = entero;
		this.cadena = cadena;
		this.caracter = caracter;
	}
	
	public Dato(){
		
		this.entero=0;
		this.cadena="0";
		this.caracter='0';		
	}
	
	

	public void Serializable(Dato nuevo){
		
		try{	
			File f = new File("/home/raul","datos.txt");
			FileWriter fw = null;
			BufferedWriter bw = null;			
			if(f.exists()){				
				fw= new FileWriter(f,true);
				bw= new BufferedWriter(fw);
				bw.newLine();
				bw.write(nuevo.entero+"#"+nuevo.cadena+"#"+nuevo.caracter);	
				bw.close();
				fw.close();			
			}else{				
				fw= new FileWriter(f,true);
				bw= new BufferedWriter(fw);
				bw.write(nuevo.entero+"#"+nuevo.cadena+"#"+nuevo.caracter);
				bw.close();
				fw.close();
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
