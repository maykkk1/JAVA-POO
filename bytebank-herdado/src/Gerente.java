public class Gerente  extends Funcionario implements Autenticavel{
	private int senha;
	
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificao() {
		return super.getSalario();
	}
	
}



