package praticafixacaotres;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		ContaCorrente c = new ContaCorrente();
		c.nomeTitular = "luís";
		c.cpf =(long) (123372378);
		c.numeroConta =(long) 8937;
		c.saldo = (double) 5.0;

		c.mostrarDados();

		c.depositar(50.0);
		c.sacar(200.0);

		c.mostrarDados();
	}

}
