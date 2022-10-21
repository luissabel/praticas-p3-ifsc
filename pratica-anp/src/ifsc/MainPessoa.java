package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setCpf("34646545973");
		aluno1.setNome("Luiz Inácio");
		aluno1.setMatricula(40028922);
		
		Professor prof1 = new Professor();
		prof1.setCpf("65924675823");
		prof1.setNome("Bruna");
		prof1.setSiape(454482304);
		
		System.out.println("o cpf do aluno é: " +aluno1.getCpf());
		System.out.println("o nome do aluno é "+aluno1.getNome());
		System.out.println("a matrícula do aluno é "+aluno1.Matricula());
		
		System.out.println("o cpf do professor é: " +prof1.getCpf());
		System.out.println("o nome do aluno é "+prof1.getNome());
		System.out.println("a matrícula do aluno é "+prof1.getSiape());
		
	}

}
