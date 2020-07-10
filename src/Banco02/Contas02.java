package Banco02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contas02 {

	/*
	 * Refazer o exemplo do Banco para que ele contenha uma lista de contas, contas
	 * correntes e contas poupanças.
	 * 
	 */
	private String nome;
	private int conta;
	private double saldo;
	private List<ContaBancaria> Cb;
	private List<ContaPoupança> Cp;
	private List<ContaCorrente> Cc;

	Scanner sc = new Scanner(System.in);

	public Contas02() {
		Cb = new ArrayList<ContaBancaria>();
		Cp = new ArrayList<ContaPoupança>();
		Cc = new ArrayList<ContaCorrente>();
	}

	public boolean Adicionar_contato(int e, String nome, int conta, double saldo) {

		switch (e) {
		case 1:
			Cb.add(new ContaBancaria(nome, conta, saldo));
			break;

		case 2:
			Cp.add(new ContaPoupança(nome, conta, saldo));
			break;

		case 3:
			Cc.add(new ContaCorrente(nome, conta, saldo));
			break;
		}
		return true;
	}

	public void List_contas(String tipo) {

		if (tipo.equalsIgnoreCase("Poupança")) {
			mostrar_list(Cp);
		} else if (tipo.equalsIgnoreCase("Corrente")) {
			mostrar_list(Cc);
		} else if (tipo.equalsIgnoreCase("Bancaria")) {
			mostrar_list(Cb);
		}
	}

	private void mostrar_list(List<? extends ContaBancaria> tipo) { // pega o tipo de Array passado no metodo
																	// List_contas
		for (ContaBancaria a : tipo) {
			System.out.println(a.toString());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacar(List<? extends ContaBancaria> tipo) { //realiza operação de saque com o paramentro array recebido.

		int num;
		System.out.println("Digite o numero da conta");
		num = sc.nextInt();
		for (ContaBancaria args : tipo) {

			if (args.getNum() == num) {
				System.out.println(args.toString());
				System.out.print("Qual o valor do saque? : ");
				double num1 = sc.nextDouble();
				if (num1 > 0) {
					args.sacar(num1);
					System.out.println("Saque realizado com sucesso!.");
					System.out.println("Saldo na sua conta: $" + args.saldo);
					return true;
				} else {
					System.out.println("Saque invalido");
				}
			}

		}
		System.out.println("Essa conta não existe");
		return false;
	}

	public void cadastro(int num) {

		System.out.print("Digite seu nome : ");
		sc.nextLine();
		nome = sc.next();
		System.out.print("Digite o numero d conta: ");
		conta = sc.nextInt();
		System.out.println("Coloque o valor do deposito");
		saldo = sc.nextDouble();

		if (num == 1) {
			Adicionar_contato(num, nome, conta, saldo);
		} else if (num == 2) {
			Adicionar_contato(num, nome, conta, saldo);
		} else if (num == 3) {
			Adicionar_contato(num, nome, conta, saldo);
		}
	}

	public boolean deposito(List<? extends ContaBancaria> array) { // realiza operções de deposito com parametro array recebido

		System.out.println("Digite o numero da conta");
		int conta = sc.nextInt();

		for (ContaBancaria args : array) {

			if (args.getNum() == conta) {

				System.out.println(args.toString());
				System.out.print("Qual valor do deposito? : ");
				double num = sc.nextDouble();
				if (num > 0) {
					args.depositar(num);
					return true;
				} else {
					System.out.println("Deposito invalido");
					return false;
				}
			}
		}
		System.out.println("Essa conta não existe");
		return false;
	}

	public void operacao(String tipo, int i) {

		if (tipo.equalsIgnoreCase("Poupança")) {
			if (i == 1) {
				sacar(Cp);
			} else if (i == 2) {
				deposito(Cp);
			}

		} else if (tipo.equalsIgnoreCase("Corrente")) {
			if (i == 1) {
				sacar(Cc);
			} else if (i == 2) {
				deposito(Cc);
			}
		} else if (tipo.equalsIgnoreCase("Bancaria")) {
			if (i == 1) {
				sacar(Cb);
			} else if (i == 2) {
				deposito(Cb);
			}
		}

	}

}
