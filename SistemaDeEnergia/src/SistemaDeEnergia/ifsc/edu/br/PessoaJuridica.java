package SistemaDeEnergia.ifsc.edu.br;

public class PessoaJuridica extends Cliente{

	String cnpj;
	
	public PessoaJuridica(int clienteId, String nome, Endereco enderco, String cnpj) {
		super(clienteId, nome, enderco);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
