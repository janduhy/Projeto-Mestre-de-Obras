package classes;

import java.util.ArrayList;

public class Obra {
	
	private Endereco endereco;
	private ArrayList<Atividade> atividades;
	private double orcamentoInicial;
	private ArrayList<Gasto> gastos;
	private ArrayList<Acrescimo> acrescimos;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	public double getOrcamentoInicial() {
		return orcamentoInicial;
	}
	public ArrayList<Gasto> getGastos() {
		return gastos;
	}
	public ArrayList<Acrescimo> getAcrescimos() {
		return acrescimos;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}		
	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}
	public void setOrcamentoInicial(double orcamentoInicial) {
		this.orcamentoInicial = orcamentoInicial;
	}
	public void setGastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}
	public void setAcrescimos(ArrayList<Acrescimo> acrescimos) {
		this.acrescimos = acrescimos;
	}
}
