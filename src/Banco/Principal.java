package Banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Contas n1 = new Contas("Itau");
		int num;
		@SuppressWarnings("unused")
		String nome;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println(" 1 - adiconar conta");
			System.out.println(" 2 - procurar conta");
			System.out.println(" 3 - mostar contas");
			System.out.println(" 4 - depositar");
			System.out.println(" 5 - sacar");
			System.out.println(" 6 - Transferir");
			System.out.println(" 7 - sair");
			num = scan.nextInt();
			
			if(num == 1) {
				n1.cadastar_Conta();
			}
			else if(num == 2) {
				
				System.out.println("Digite o numero da conta");
				num = scan.nextInt();
				n1.procurar_Conta(num);
			}
			else if(num == 3) {
				n1.mostrar_Contas();
			}
			else if(num == 4){
				n1.transferencia();
			}
			else if(num == 5) {
				n1.sacar(num);
			}
			else if(num == 6) {
				n1.entreContas();
			}
			
		}while(num != 7);
			
		
	}

}
