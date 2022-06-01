package SistemaDeEnergia.ifsc.edu.br;

import java.util.ArrayList;
import java.util.List;

public class Endereco {

	String rua;
	int numero;
	String cep;
	String cidade;
	String estado;
	
	 private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Endereco(String rua, int numero, String cep, String cidade, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", cep=" + cep + ", cidade=" + cidade + ", estado="
				+ estado + "]";
	}



	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}  
	
	
}
