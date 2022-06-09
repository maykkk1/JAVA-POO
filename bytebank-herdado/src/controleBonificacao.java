
public class controleBonificacao {
	private double soma;
	
	public void registra (Funcionario f) {
		this.soma += f.getBonificao();
	}
	
	public double getSoma() {
		return this.soma;
	}
	
	
}
