package Controller;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class NomesBean {
	private String nome;
	private ArrayList<String> nomes = new ArrayList<>();

	public void adicionar() {
		this.nomes.add(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getNomes() {
		return nomes;
	}
}