package br.com.nuvemapp.exemploclientpostmonapijava.service;

import br.com.nuvemapp.exemploclientpostmonapijava.model.Endereco;

public interface Localizacao {
	public static final String URL = "http://api.postmon.com.br";
	public static final String VERSION = "v1";
	public static final String FORMAT = "json";

	Endereco procurarEndereco(String zipcode);
}
