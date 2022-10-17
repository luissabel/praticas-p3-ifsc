package praticafixacao;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		ArrayList<gato> gatinhos = new ArrayList<>();

		gato gato1 = new gato();
		gato1.setNome("gato 1");
		gato1.setNumpatas(4);
		gato1.setRaca("persa");
		gato1.setEcossistema("casa");
		gato1.setCor("rajado");
		gato1.setComprimento(20.0f);
		gatinhos.add(gato1);

		gato gato2 = new gato();
		gato2.setNome("gato 2");
		gato2.setNumpatas(4);
		gato2.setRaca("siamês");
		gato2.setEcossistema("casa");
		gato2.setCor("chocolate");
		gato2.setComprimento(30.0f);
		gatinhos.add(gato2);

		gato gato3 = new gato();
		gato3.setNome("gato 3");
		gato3.setNumpatas(4);
		gato3.setRaca("persa");
		gato3.setEcossistema("casa");
		gato3.setCor("cinza");
		gato3.setComprimento(35.0f);
		gatinhos.add(gato3);

		ArrayList<cachorro> cachorros = new ArrayList<>();

		cachorro cachorro1 = new cachorro();
		cachorro1.setNome("cachorro 1");
		cachorro1.setNumpatas(4);
		cachorro1.setRaca("beagle");
		cachorro1.setEcossistema("casa");
		cachorro1.setCor("preto,branco e marrom");
		cachorro1.setComprimento(41.0f);
		cachorros.add(cachorro1);

		cachorro cachorro2 = new cachorro();
		cachorro2.setNome("cachorro 2");
		cachorro2.setNumpatas(4);
		cachorro2.setRaca("pit bull");
		cachorro2.setEcossistema("casa");
		cachorro2.setCor("marrom");
		cachorro2.setComprimento(50.0f);
		cachorros.add(cachorro2);

		cachorro cachorro3 = new cachorro();
		cachorro3.setNome("cachorro 3");
		cachorro3.setNumpatas(4);
		cachorro3.setRaca("pastor alemão");
		cachorro3.setEcossistema("casa");
		cachorro3.setCor("marrom e preto");
		cachorro3.setComprimento(60.0f);
		cachorros.add(cachorro3);

		for (cachorro cachorro : cachorros) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumpatas());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
			cachorro.late();

		}

		for (gato gato : gatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getNumpatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
			gato.mia();
		}

	}
}
