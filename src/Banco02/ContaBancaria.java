package Banco02;

import java.util.Scanner;

public class ContaBancaria {

	protected String nome;
	protected int num;
	protected double saldo;
	Scanner scanner = new Scanner(System.in);

	public ContaBancaria(String nome, int num, double saldo) {

		this.nome = nome;
		this.num = num;
		this.saldo = saldo;

	}

	public ContaBancaria(String nome, int num) {
		
		this.nome = nome;
		this.num = num;
	}

	public boolean depositar(double dinheiro) {

		if (dinheiro <= 0) {
			System.out.println("Valor não correspondido");

		} else if (dinheiro > 0) {
			this.saldo = dinheiro + saldo;
			return true;
		}
		return false;
	}

	public void sacar(double sacar) {

		if (sacar <= this.saldo) {
			this.saldo = this.saldo - sacar;
		}
		if (sacar > this.saldo) {
			System.out.println("Valor acima do permitido");

		}
	}

	public void mostrar_Saldo() {
		System.out.println(this.nome + " : " + this.saldo);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNum() {
		return num;
	}

	public String toString() {
		return "Nome: "+ nome
				+", Conta: "
				+ num
				+ ", Saldo: "
				+ saldo;
	}

}
