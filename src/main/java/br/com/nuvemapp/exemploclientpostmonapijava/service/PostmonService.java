package br.com.nuvemapp.exemploclientpostmonapijava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestOperations;

import br.com.nuvemapp.exemploclientpostmonapijava.model.Endereco;

public class PostmonService implements Localizacao {

	@Autowired
	private RestOperations service;

	public Endereco procurarEndereco(String cep) {
		Endereco endereco = service.getForObject(Localizacao.URL + "/" + Localizacao.VERSION + "/cep/"+cep+"?format=json", Endereco.class);
		return endereco;
	}

}
