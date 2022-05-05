package Media;

import java.util.Scanner;

public class Media {

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	
	

	private double getNota1() {
		return nota1;
	}

	private void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	private double getNota2() {
		return nota2;
	}

	private void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	private double getNota3() {
		return nota3;
	}

	private void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	private double getNota4() {
		return nota4;
	}

	private void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	private double getMedia() {
		return media;
	}

	private void setMedia(double media) {
		this.media = media;
	}
	Scanner scan = new Scanner(System.in);
	
	public void cadastrarNotas() {
	System.out.println("Digite a nota1: ");
	setNota1(scan.nextDouble());
	System.out.println("Digite a nota2: ");
	setNota2(scan.nextDouble());
	System.out.println("Digite a nota3: ");
	setNota3(scan.nextDouble());
	System.out.println("Digite a nota4: ");
	setNota4(scan.nextDouble());
	}
	
	public void calcularMedia() {
	setMedia((getNota1()+getNota2()+getNota3()+getNota4())/4);
		
	}
	public void mostrarNotas() {
		System.out.println("Nota 1: "+getNota1());
		System.out.println("Nota 2: "+getNota2());
		System.out.println("Nota 3: "+getNota3());
		System.out.println("Nota 4: "+getNota4());
		
	}
	public void mostrarMedia() {
		System.out.println("Media: "+getMedia());
	}
	
	public void verificarAprovacao() {
		if(getMedia() == 10) { 
			System.out.println("Aprovado com distinção");
		}else if(getMedia()>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
