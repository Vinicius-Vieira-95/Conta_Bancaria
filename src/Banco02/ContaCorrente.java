package Banco02;

public class ContaCorrente extends ContaBancaria {
	
	private double limite;

	public ContaCorrente( String nome, int num,double saldo) {
		super(nome, num, saldo);
		
		this.limite = 100;
	}
	
	public boolean debitarAnuidade(double e) {
		saldo -= e;
		return true;
	}

	public double getLimite() {
		return limite;
	}

}
