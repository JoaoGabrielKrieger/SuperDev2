package Media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Media media = new Media();
		int flag = 0;

		while (flag == 0) {
			System.out.println(
					"Digite a opção que deseja executar: \n 1 -> Cadastrar notas \n 2 -> Calcular média \n 3 -> Mostrar notas"
							+ "\n 4 -> Mostrar média \n 5 -> Verificar aprovação");
			int op = s.nextInt();

			switch (op) {
			case 1:
				media.cadastrarNotas();
				break;
			case 2:
				media.calcularMedia();
				break;
			case 3:
				media.mostrarNotas();
				break;
			case 4:
				media.mostrarMedia();
				break;
			case 5:
				media.verificarAprovacao();
				break;
			}
			System.out.println("Deseja executar mais uma ação? \n 0 -> Sim \n 1 -> Não");
			flag=s.nextInt();
		}

	}

}
