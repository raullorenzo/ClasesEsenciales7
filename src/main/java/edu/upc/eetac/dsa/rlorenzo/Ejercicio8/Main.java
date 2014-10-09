package edu.upc.eetac.dsa.rlorenzo.Ejercicio8;

public class Main extends Thread{
	
	public static void main (String[] args){
		
		Dato objeto1 = new Dato();
		Dato objeto2 = new Dato();		
		Dato objeto3 = new Dato();
		Dato objeto4 = new Dato();


		
		objeto1.Serializable(new Dato(1,"Objeto1",'A'));
		objeto2.Serializable(new Dato(2,"Objeto2",'B'));
		objeto3.Serializable(new Dato(3,"Objeto3",'C'));
		objeto4.Serializable(new Dato(4,"Objeto4",'E'));
		objeto1.Serializable(new Dato(1,"Objeto1",'A'));
		
	}
}
