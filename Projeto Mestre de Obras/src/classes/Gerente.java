package classes;

import java.util.ArrayList;

public class Gerente {
	
	private static Gerente gerente;
	public static Gerente obterInstancia() {
		if (gerente == null)
			gerente = new Gerente();
		return gerente;
	}
	
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Obra> obras = new ArrayList<Obra>();

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void addFuncionario(Funcionario funcionario){
		this.funcionarios.add(funcionario);
	}
	public void deletarFuncionario(Funcionario funcionario){
		for(Funcionario a: funcionarios){
			if(funcionario.equals(a)){
				this.funcionarios.remove(a);
			}
		}
	}
	public void deletarFuncionario(int indice){
		this.funcionarios.remove(indice);
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	public void addObra(Obra obra){
		this.obras.add(obra);
	}
	
	public void deletarObra(Obra obra){
		Endereco endereco1 = obra.getEndereco();
		for(Obra a: obras){
			Endereco endereco2 = a.getEndereco();
			if(endereco2.equals(endereco1)){
				this.obras.remove(a);
			}
		}
	}
	public void deletarObra(int indice){
		this.obras.remove(indice);
	}
}
