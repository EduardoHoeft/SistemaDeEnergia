package SistemaDeEnergia.ifsc.edu.br;

public class PessoaFisica extends Cliente{

	String cpf;
	
	public PessoaFisica(int clienteId, String nome, Endereco enderco, String cpf) {
		super(clienteId, nome, enderco);
		this.cpf = cpf;
	}

	
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
