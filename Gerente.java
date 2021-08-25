public class Gerente extends Funcionario {
	
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean authentic(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	
		public double getBonificacao() {
				return super.getSalario() * 0.15;
		}
		
		public double salarioliquido() {
			
			double imposto = super.getSalarioliquido() * 0.15;
			double salariofinal = super.getSalario() + getBonificacao() - imposto;
			return salarioFinal;
		}
	
	
	
	}

	@Override
	public double salarioLiquido() {
		// TODO Auto-generated method stub
		return 0;
	}
}
