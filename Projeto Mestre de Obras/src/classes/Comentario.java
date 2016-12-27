package classes;

import java.util.Date;

public class Comentario {
	
	private Date data;
	private String descricao;
	
	public Date getData() {
		return data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
