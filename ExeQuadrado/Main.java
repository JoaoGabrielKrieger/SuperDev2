package ExeQuadrado;

public class Main {

	public static void main(String[] args) {
		
		Quadrado quad = new Quadrado();
		
		quad.mudarValorLado();
		quad.retornarValorLado();
		System.out.println("A área do quadrado é "+quad.calcularArea());

	}

}
