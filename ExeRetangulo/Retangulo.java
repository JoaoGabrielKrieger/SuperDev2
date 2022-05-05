package ExeRetangulo;

import java.util.Scanner;

public class Retangulo {

	Scanner s = new Scanner(System.in);
	public double ladoA,ladoB;

	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	
	public void mudarValores() {
		System.out.println("Digite o valor do lado A: ");
		setLadoA(s.nextDouble());
		System.out.println("Digite o valor de B: ");
		setLadoB(s.nextDouble());
	}
	
	public void retornarLados() {
		System.out.println(getLadoA());
		System.out.println(getLadoB());
	}
	
	public void calcularArea() {
		System.out.println(getLadoA()*getLadoB());
	}
	
	public void calcularPerimetro() {
		System.out.println((getLadoA()+getLadoB()*2));
	}
	
	
	
}
