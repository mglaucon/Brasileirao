package modelo;

public class Tabela implements Comparable<Tabela>{
	private String nome;
	private Integer pontos,jogos,saldo;
	
	public Tabela(){}
	public Tabela(String nome, Integer pontos, Integer jogos, Integer saldo){
		this.nome = nome;
		this.pontos = pontos;
		this.jogos = jogos;
		this.saldo = saldo;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Integer getPontos(){
		return pontos;
	}
	public void setPontos(Integer pontos){
		this.pontos = pontos;
	}
	public Integer getJogos() {
		return jogos;
	}
	public void setJogos(Integer jogos) {
		this.jogos = jogos;
	}
	public Integer getSaldo(){
		return saldo;
	}
	public void setSaldo(Integer saldo){
		this.saldo = saldo;
	}
	
/*
	public String toString(){
		return nome +" "+ pontos;
	}
	*/
	@Override
	public int compareTo(Tabela cl) {
		
		//return this.pontos.compareTo(cl.getPontos());
		if(cl.getPontos().equals(this.getPontos()))	return cl.getSaldo().compareTo(this.getSaldo());
		else	return cl.getPontos().compareTo(this.getPontos());
	}

}
