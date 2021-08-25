
public class Principal {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("João");
		g1.setCpf("273.739.173-32");
		g1.setSalario(3000);
		g1.setSenha(2222);
		
		System.out.println("--------------------");
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Cpf: " + g1.getCpf());
		System.out.println("salario: " + g1.getSalario());
		System.out.println("Bonus: " + g1.getBonificacao());
		System.out.println("O salario final é:" + g1.salarioLiquido());
		
		Coordenador c1 = new Coordenador();
		c1.setNome("Thayani");
		c1.setSalario(5000);
		c1.setCpf("324343434");
		
		System.out.println("-------------------------------");
		System.out.println("Nome: "+c1.getNome());
		System.out.println("Cpf: "+c1.getCpf());
		System.out.println("Salario: "+c1.getSalario());
		System.out.println("Cpf: "+c1.getBonificacao());
		System.out.println("O salario final é:" + g1.salarioLiquido());
		
		System.out.println("-------------------------");
		ControleBonificacao control = new ControleBonificacao();
		control.registra(g1);
		control.registra(c1);
		System.out.println("Gastos totais com bonificação" + control.getSoma());
	}

}
