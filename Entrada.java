package pkgcontroledeponto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrada extends ControleDePonto{

	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
	
	public Entrada() {
		super("Entrada do funcionário");
		
	}

	@Override
	public void nome(String nome) {
		System.out.println("\nNome do Funcionário: " + nome);
	}

	@Override
	public void idCartao(int idCartao) {
		System.out.println("\nId do cartão do funcionário: " + idCartao);		
	}
	
	
	public void EntradaDoFuncionario() {
		
        System.out.println("Entrada registrada em: "+dtf2.format(LocalDateTime.now()));
	}

	
	
}
