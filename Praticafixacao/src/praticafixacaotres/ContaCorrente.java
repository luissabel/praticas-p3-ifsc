package praticafixacaotres;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public void depositar(Double valorDeposito) {
		saldo = saldo + valorDeposito;
	}

	public Double sacar(Double valorSaque) {

		double retornoSaque = 0;
		if (valorSaque > saldo) {
			System.out.println("saldo insuficiente");
		} else {
			saldo = saldo - valorSaque;
		}
		return retornoSaque;
	}

	public void mostrarDados() {
		System.out.println("Titular" + nomeTitular);
		System.out.println("cpf: " + cpf);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo conta: " + saldo);
	}

}
