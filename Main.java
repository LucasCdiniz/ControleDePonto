package pkgcontroledeponto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Entrada ent = new Entrada();
		
		
		
		Scanner ler = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n\t\tMenu de Op��es ");
			System.out.println("\n(1) Fazer a entrada do Funcion�rio");
			System.out.println("\nDigite a sua op��o: ");
			
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Informe o nome do funcion�rio: ");
				String nome = ler.next();
				System.out.println("Informe o id do cart�o: ");
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
				System.out.println("Dados inv�lidos. . .");
			}
			
		}while(op!=3);
	}

}
