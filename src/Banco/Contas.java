package Banco;

import java.util.ArrayList;
import java.util.Scanner;

// Lista de contas pela Conta Bancaria.

public class Contas {

	private String banco;
	private String nomes;
	private ArrayList<ContaBancaria>conta;
	
	Scanner scanner = new Scanner(System.in);
	int num;
	
	public Contas(String banco) {
		this.banco = banco;
		conta = new ArrayList<ContaBancaria>();
		
	}
	
	public boolean procurar_Conta(int num){
		
		for(ContaBancaria cb: this.conta) {
				
			if(cb.getNum() == num) {
				System.out.println(cb.getNome()+" : "+ cb.getSaldo());
				return true;
			}
		}
		
		System.out.println("Numero invalido");
		return false;
	}
	public void cadastar_Conta() {
			
			System.out.println("Informe o seu nome");
			String nome = scanner.next();
			System.out.println("Coloque o numero de sua conta");
			int num = scanner.nextInt();
			
			conta.add(new ContaBancaria(nome, num, 0));
			
	}
	
	public boolean transferencia() {
			
			System.out.println("Digite o numero da conta");
			num = scanner.nextInt();
			
			for(ContaBancaria cb : this.conta) {
				
				if(cb.getNum() == num) {
					
					System.out.println(cb.getNome()+" : "+ cb.getSaldo());
					System.out.print("Qual valor da transferência? : ");
					double num = scanner.nextDouble();
					if(num > 0) {
						cb.depositar(num);
						return true;
					}
					else {	
						System.out.println("Deposito invalido");
						return false;
					}
				}
			}
			System.out.println("Essa conta não existe");
			return false;
	}		
	public void mostrar_Contas() {
		
			for(ContaBancaria cb : this.conta) {
				System.out.println(cb.getNome() + " : " + cb.getNum()+" Saldo :"+ cb.getSaldo());
			}
	}
	public boolean sacar(int num) {
		
		System.out.println("Digite o numero da conta");
		num = scanner.nextInt();
		for(ContaBancaria cb : this.conta) {
			
			if(cb.getNum() == num) {
				System.out.println("Nome: " +cb.getNome() + "\n conta: " + cb.getNum()+ "\nsaldo: "+ cb.getSaldo());
				System.out.print("Qual o valor do saque? : ");
				double num1 = scanner.nextDouble();
				if( num1 > 0) {
					cb.sacar(num1);
					System.out.println("Saque realizado com sucesso!.");
					return true;
				}
				else {
					System.out.println("Saque invalido");
				}
			}
			
		}
		System.out.println("Essa conta não existe");
		return false;
	}
	
	public boolean entreContas() {
		
		System.out.println("Informe o numero de sua conta");
		num = scanner.nextInt();
		
		for(ContaBancaria cb : this.conta) {
			
			if(cb.getNum() == num) {
				
				System.out.println("Nome: " +cb.getNome() + "\nConta: " + cb.getNum()+ "\nsaldo: "+ cb.getSaldo());
				System.out.print("Digite o numero da conta da transferencia: ");
				num = scanner.nextInt();
				System.out.print("Digite o valor da transferencia: ");
				double din = scanner.nextDouble();
				if(din > 0) {
					
					for(ContaBancaria cb2 : this.conta) {
						if(cb2.getNum() == num) {
							
							System.out.println("Nome: " +cb2.getNome() + "\nConta: " + cb2.getNum()+ "\nsaldo: "+ cb2.getSaldo());
							System.out.println("Confirma conta?");
							System.out.print("1 - Sim ,2 - Não: ");
							int i = scanner.nextInt();
							if( i == 1) {
								cb.sacar(din);
								cb2.depositar(din);
								System.out.println("Transferencia realizada com sucesso!.");
								return true;
							}
							else if(i == 2) {
								return false;
							}
						}
						
					}
				}
				else if(din > cb.getSaldo() || din < 0) {
					System.out.println("Transferencia invalida");
					return false;
				}
				
				
			}
			
		}
		
		return false;
	}
	
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public String getNomes() {
			return nomes;
		}
		public void setNomes(String nomes) {
			this.nomes = nomes;
		}
		public ArrayList<ContaBancaria> getConta() {
			return conta;
		}
		public void setConta(ArrayList<ContaBancaria> conta) {
			this.conta = conta;
		}

}
