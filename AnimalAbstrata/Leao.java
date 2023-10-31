package AnimalAbstrata;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome,sexo,raca);
	}
	
	@Override
	public void dormir () {
		System.out.println ("dormindo");
	}
	@Override
	public void caminhar () {
		System.out.println ("caminhando");
	}

	@Override
	public void correr () {
		System. out.println ("correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O leao esta rugindo");
	}
}

