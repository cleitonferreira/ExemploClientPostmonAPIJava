package br.com.nuvemapp.exemploclientpostmonapijava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {

	@XmlElement(name = "logradouro")
	private String logradouro;

	@XmlElement(name = "cep")
	private String cep;

	@XmlElement(name = "bairro")
	private String bairro;

	@XmlElement(name = "cidade")
	private String cidade;

	@XmlElement(name = "estado")
	private String estado;

	@XmlElement(name = "complemento")
	private String complemento;

	@XmlElement(name = "unidade")
	private String unidade;

	@XmlElement(name = "endereco")
	private String endereco;

	@XmlElement(name = "estado_info")
	private EstadoInfo estado_info; 
	
	@XmlElement(name = "cidade_info")
	private CidadeInfo cidade_info;

	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public EstadoInfo getEstado_info() {
		return estado_info;
	}
	public void setEstado_info(EstadoInfo estado_info) {
		this.estado_info = estado_info;
	}

	public CidadeInfo getCidade_info() {
		return cidade_info;
	}
	public void setCidade_info(CidadeInfo cidade_info) {
		this.cidade_info = cidade_info;
	}
	
}