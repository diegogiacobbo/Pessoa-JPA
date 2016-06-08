package View;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
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