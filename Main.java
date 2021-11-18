package pkgcontroledeponto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Entrada ent = new Entrada();
		
		
		
		Scanner ler = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n\t\tMenu de Opções ");
			System.out.println("\n(1) Fazer a entrada do Funcionário");
			System.out.println("\nDigite a sua opção: ");
			
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Informe o nome do funcionário: ");
				String nome = ler.next();
				System.out.println("Informe o id do cartão: ");
				int idCartao = ler.nextInt();
				System.out.println("--------------------------------------------------------------------");
				
				ent.EntradaDoFuncionario();
				ent.nome(nome);
				ent.idCartao(idCartao);
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
				System.out.println();
				break;
			default:
				System.out.println("Dados inválidos. . .");
			}
			
		}while(op!=3);
	}

}
