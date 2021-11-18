package pkgcontroledeponto;

public abstract class ControleDePonto {

	private String tipo;
	
	public ControleDePonto(String tipo) {
		this.tipo=tipo;
	}
	
	abstract public void nome(String nome);
	abstract public void idCartao(int idCartao);

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
