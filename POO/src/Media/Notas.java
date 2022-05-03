package Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

	Scanner s = new Scanner(System.in);
	public ArrayList<Double> notas = new ArrayList();
	public double result=0;
	
	public void entradaNotas() {
		for(int i=0;i < 4;i++) {
			System.out.println("Digite a nota do aluno:");
			notas.add(s.nextDouble());
		}
	}
	
	public void calculoMedia() {
		for(Double n : notas) {
			result += n/notas.size();
		}
	}
	
	
	public void saidaNotas() {
		System.out.println("A média do aluno é: "+result);
	}
	
}
