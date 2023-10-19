package PetShop;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String nome, especie, raca, dataNasci, proprietario;
	private List<Servico> servicosP;
	
	public Animal(String nome, String especie, String raca, String dataNasci, String proprietario) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.dataNasci = dataNasci;
		this.proprietario = proprietario;
		this.servicosP = new ArrayList<>();
	}

	

	public String getNome() {
		return nome;
	}

	public Animal(String nome) {
	super();
	this.nome = nome;
}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNasci() {
		return dataNasci;
	}

	public void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

public void adicionarServico(Servico servico) {
		
		servicosP.add(servico);
		
		
	}
	
	public List<Servico> getServicosPrestados() {
		
		return servicosP;
		
	}
	public String toString() {
		return "Nome: " + nome + ", Espécie: " + especie + ", Raça: " + raca + ", Data de Nascimento: " + dataNasci + ", Proprietario: " + proprietario;
	
	}
	
	
}
