package model;

public class Paralelogramo extends Quadrilatero {

	public Paralelogramo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcArea() {
		
		return getBase()*getAltura();
	}

}
