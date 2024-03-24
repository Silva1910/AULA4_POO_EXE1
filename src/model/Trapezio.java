package model;

public class Trapezio extends Quadrilatero {

	private int baseMenor;
	
	
	public int getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
	}




	public Trapezio() {
		
	}


	
	
	@Override
	public float calcArea() {
		return ((getBaseMenor() + getBase()) * getAltura())  / 2;
		
	}

}
