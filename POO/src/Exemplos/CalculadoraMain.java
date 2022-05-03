package Exemplos;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Scanner s = new Scanner (System.in);
		boolean flag = true;
		int op=0;
		
		System.out.println("Digite o primeiro número: ");
		c.num1 = s.nextFloat();
		System.out.println("Digite o segundo número: ");
		c.num2 = s.nextFloat();
		
		while(flag==true) {
			System.out.println("Digite a operação desejada: \n 1 -> Soma \n 2 -> Subtração \n 3 -> Multiplicação \n 4 -> Divisão");
			op= s.nextInt();
			if(op > 4 || op < 1) {
				System.out.println("Operação incorreta, digite novamente!");
			}else {
				flag=false;
			}
		}
		flag = true;
		
		
		if(op==1) {
			System.out.println("O resultado do calculo é: "+c.adicao());
		}else if(op==2) {
			System.out.println("O resultado do calculo é: "+c.subtracao());
		}else if(op==3) {
			System.out.println("O resultado do calculo é: "+c.multiplicacao());
		}else if(op==4){
			System.out.println("O resultado do calculo é: "+c.divisao());
		}
	}

}
