package br.com.nuvemapp.exemploclientpostmonapijava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.nuvemapp.exemploclientpostmonapijava.model.Endereco;
import br.com.nuvemapp.exemploclientpostmonapijava.service.Localizacao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { MainApplication.class })
@WebAppConfiguration
public class PostmonServiceTest {
	
	@Autowired
	private Localizacao localizacao;

	// http://api.postmon.com.br/v1/cep/18095450?format=json
	@Test
	public void cepSorocabaSP() {
		Endereco endereco = localizacao.procurarEndereco("18095-450");
		resultado(endereco);
		Assert.assertNotNull(endereco);
	}

	// http://api.postmon.com.br/v1/cep/27600-000?format=json
	@Test
	public void cepValencaRJ() {
		Endereco endereco = localizacao.procurarEndereco("27600-000");
		resultado(endereco);
		Assert.assertNotNull(endereco);
	}

	private void resultado(Endereco endereco) {

		System.out.println("Resultado: ");
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
		System.out.println("Cep: " + endereco.getCep());

		System.out.println("EstadoInfo Km2: " + endereco.getEstado_info().getArea_km2());
		System.out.println("EstadoInfo IBGE: " + endereco.getEstado_info().getCodigo_ibge());

		System.out.println("CidadeInfo Km2: " + endereco.getCidade_info().getArea_km2());
		System.out.println("CidadeInfo IBGE: " + endereco.getCidade_info().getCodigo_ibge());
		System.out.println();
	}
}
