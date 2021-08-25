
public class Coordenador extends Funcionario{
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.15 + 1000;
	}
	
	@Override
	public double salarioLiquido() {
		double salarioFinal = super.getSalario() + this.getBonificacao();
		
		return salarioFinal;
	}
}
