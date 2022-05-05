package ExeBola;

import java.util.Scanner;

public class Bola {
	
	Scanner s = new Scanner(System.in);
	public String cor,material;
	public double circunferencia,raio;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	
	public void TrocaCor() {
		System.out.println("Digite a nova cor: ");
		setCor(s.next());
	}
	
	public void mostraCor() {
		System.out.println(getCor());
	}
	
	public void calculaRaio() {
		System.out.println("Digite a circunferência: ");
		setCircunferencia(s.nextDouble());
		setRaio(getCircunferencia()/2);
	}
	
	public void mostraRaio() {
		System.out.println(getRaio());
	}

}
