package classes;

import java.util.Date;

public class Gasto {
	
	private Date data;
	private double valor;
	private String descricao;
	
	public Date getData() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
