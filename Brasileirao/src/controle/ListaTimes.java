package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Tabela;

public class ListaTimes {
	private List<Tabela> lista;
	public ListaTimes() {}

	public List<Tabela> getLista() {
		return lista;
	}

	public void setLista(List<Tabela> lista) {
		this.lista = lista;
	}
	
	public void addLista(Tabela cl) {
		if (lista == null)	lista = new ArrayList<Tabela>();
		lista.add(cl);
		Collections.sort(lista);
	}
}
