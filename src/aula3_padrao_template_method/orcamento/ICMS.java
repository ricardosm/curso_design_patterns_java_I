package aula3_padrao_template_method.orcamento;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.0;
	}

}
