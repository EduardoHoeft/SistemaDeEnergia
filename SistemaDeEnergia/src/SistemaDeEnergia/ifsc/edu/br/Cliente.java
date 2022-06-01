package SistemaDeEnergia.ifsc.edu.br;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	int clienteId;
	String nome;
	Endereco endereco;
	
	 private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	
	public Cliente(int clienteId, String nome, Endereco endereco) {
		super();
		this.clienteId = clienteId;
		this.nome = nome;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nome=" + nome + ", endereco=" + endereco + "]";
	}


	public int getClienteId() {
		return clienteId;
	}


	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
