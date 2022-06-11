
public class testaBonificacao {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		controleBonificacao c = new controleBonificacao();
	
		c.registra(g1);
		System.out.println(c.getSoma());
	}
}

