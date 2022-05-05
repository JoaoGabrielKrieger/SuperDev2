package ExePessoa;

import java.util.Scanner;

public class Pessoa {

	Scanner s = new Scanner(System.in);
	public String nome,corPele;
	public int idade;
	public double peso,altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorPele() {
		return corPele;
	}
	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void envelhecer() {
		setIdade(this.idade+1);
		
	}
	
	public void engordar() {
		System.out.println("Digite quandos kg's você engordou: ");
		setPeso(this.peso + s.nextDouble());
	}
	
	public void emagrecer() {
		System.out.println("Digite quandos kg's você emagreceu: ");
		setPeso(this.peso - s.nextDouble());
	}
	
	public void crescer() {
		if(getIdade() < 21) {
			setAltura(this.altura + 0.05);
		}
	}
}
