package classes;

import java.util.ArrayList;
import java.util.Date;

public class Atividade {
	
	private String nome;
	private Date dataDeCriacao;
	private int prazo;//(em dias)
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Comentario> comentarios;
	private String status;
	private Date dataDeConclusao;
	
	public String getNome() {
		return nome;
	}
	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}
	public int getPrazo() {
		return prazo;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	public String getStatus() {
		return status;
	}
	public Date getDataDeConclusao() {
		return dataDeConclusao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setDataDeConclusao(Date dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}	
}
