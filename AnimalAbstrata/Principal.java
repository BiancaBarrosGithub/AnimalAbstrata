package AnimalAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo= new Lobo("Ralf", "macho", "Husky siberiano");
		System.out.println("Nome:" + lobo.getNome());
		System.out.println("Sexo:" + lobo.getSexo());
		System.out.println("Raca:" + lobo.getRaca());
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("------------------------");
		
		Leao leao = new Leao ("Simba", "macho", "leao");
		System.out.println("Nome:" + leao.getNome());
		System.out.println("Sexo:" + leao.getSexo());
		System.out.println("Raca:" + leao.getRaca());
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("------------------------");
		
		Tigre tigre = new Tigre ("Shere Khan", "macho", "Tigre-malaio");
		System.out.println("Nome:" + tigre.getNome());
		System.out.println("Sexo:" + tigre.getSexo());
		System.out.println("Raca:" + tigre.getRaca());
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("------------------------");
		
		Cachorro cachorro = new Cachorro("Lily", "fêmea", "Golden Retriver");
		System.out.println("Nome:" + cachorro.getNome());
		System.out.println("Sexo:" + cachorro.getSexo());
		System.out.println("Raca:" + cachorro.getRaca());
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("------------------------");
		
		Gato gato = new Gato("Marie", "fêmea", "raça Angorá"
				+ "");
		System.out.println("Nome:" + gato.getNome());
		System.out.println("Sexo:" + gato.getSexo());
		System.out.println("Raca:" + gato.getRaca());
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
		System.out.println("------------------------");
		
		
		
		

	}

}
