package ExeQuadrado;

import java.util.Scanner;

public class Quadrado {

	Scanner s = new Scanner(System.in);
	public double tamanhoLado;

	public double getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	
	public void mudarValorLado() {
		System.out.println("Digite o novo valor do lado do quadrado: ");
		setTamanhoLado(s.nextDouble());
	}
	
	public void retornarValorLado() {
		System.out.println(getTamanhoLado());
	}
	
	public double calcularArea() {
		return getTamanhoLado()*getTamanhoLado();
	}

	
}
