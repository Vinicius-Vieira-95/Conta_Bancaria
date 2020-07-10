package Banco;

public class ContaPoupan�a extends ContaBancaria {

	private double taxaDeRendimento;
	
	public ContaPoupan�a(String nome, int num, double saldo) {
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
