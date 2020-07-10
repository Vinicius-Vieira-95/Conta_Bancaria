package Banco02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Contas02 c = new Contas02();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		/*
		 * c.Adicionar_contato(2, "vini", 123, 300); c.Adicionar_contato(2, "ceci", 456,
		 * 500); c.List_contas("Poupança");
		 */

		do {

			System.out.println(" 1 - cadastrar conta");
			System.out.println(" 2 - mostrar conta");
			System.out.println(" 3 - Realizar saque/deposito");
			System.out.println(" 4 - Sair do menu");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				System.out.println("Selecione que tipo de conta deseja cadastrar");
				System.out.println(" 1 - ContaBancaria / 2 - Poupança / 3 - Conrrente ");
				number = sc.nextInt();
				if (number == 1) {
					c.cadastro(number);
				} else if (number == 2) {
					c.cadastro(number);
				} else if (number == 3) {
					c.cadastro(number);
				}

				break;

			case 2:
				System.out.println("Digite qual será a lista de contas que deseja ver");
				System.out.println("Poupança / Corrente / Bancaria");
				String nome_Conta = sc.next();
				c.List_contas(nome_Conta);

				break;
			case 3:
				System.out.println("Digite qual será a conta ser colocada");
				System.out.println("Poupança / Corrente / Bancaria");
				nome_Conta = sc.next();
				System.out.println("Qual operação deseja?");
				System.out.println(" 1 - Saque");
				System.out.println(" 2 - Deposito");
				int tipoDeOperação = sc.nextInt();

				c.operacao(nome_Conta, tipoDeOperação);

				break;

			case 4:
				flag = false;
				break;
			}

		} while (flag == true);

		sc.close();

		System.out.println("Thanks");
	}

}
