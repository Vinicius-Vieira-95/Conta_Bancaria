package Banco;

public class ContaCorrente extends ContaBancaria {
	
	private double limite;

	public ContaCorrente( String nome, int num,double saldo) {
		super(nome, num, saldo);
		
		this.limite = 100;
	}
	
	public boolean debitarAnuidade(double e) {
		saldo = saldo - e;
		return true;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
