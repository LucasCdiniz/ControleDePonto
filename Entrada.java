package pkgcontroledeponto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrada extends ControleDePonto{

	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
	
	public Entrada() {
		super("Entrada do funcion�rio");
		
	}

	@Override
	public void nome(String nome) {
		System.out.println("\nNome do Funcion�rio: " + nome);
	}

	@Override
	public void idCartao(int idCartao) {
		System.out.println("\nId do cart�o do funcion�rio: " + idCartao);		
	}
	
	
	public void EntradaDoFuncionario() {
		
        System.out.println("Entrada registrada em: "+dtf2.format(LocalDateTime.now()));
	}

	
	
}
