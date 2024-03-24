package view;

import model.Paralelogramo;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {

		Trapezio t = new Trapezio();
		Paralelogramo p = new Paralelogramo();
		
		
		t.setAltura(10);
		t.setBase(10);
		t.setBaseMenor(5);
		System.out.println("a area do trapezio e " + t.calcArea());
		
		
		
		p.setAltura(10);
		p.setBase(10);
		System.out.println("a area do paralelogramo e " + p.calcArea());

	}

}
