package Banco;

public class ContaPoupanša extends ContaBancaria {

	private double taxaDeRendimento;
	
	public ContaPoupanša(String nome, int num, double saldo) {
		super(nome, num, saldo);
		taxaDeRendimento = 0.02;
	}
	
	public boolean render() {
		saldo = saldo + (saldo * this.taxaDeRendimento);
		return true;
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimnto) {
		this.taxaDeRendimento = taxaDeRendimnto;
	}
}
