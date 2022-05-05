package ExePessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setIdade(17);
		p.setAltura(1.70);
		p.setPeso(70.0);
		
		p.envelhecer();
		p.emagrecer();
		p.emagrecer();
		p.engordar();
		p.crescer();
		
		System.out.println(p.getIdade());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
	}

}
