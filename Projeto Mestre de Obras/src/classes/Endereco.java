package classes;

public class Endereco {
	
	private String rua;
	private int numero;
	private String CEP;
	private String cidade;
	private String bairro;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public boolean equals(Endereco endereco){
		if(this.rua.equals(endereco.rua) && this.cidade.equals(endereco.cidade) && this.bairro.equals(endereco.bairro) && this.CEP.equals(endereco.CEP) && this.numero == endereco.numero)
			return true;
		else
			return false;
	}
}
