package br.com.nuvemapp.exemploclientpostmonapijava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.nuvemapp.exemploclientpostmonapijava.MainApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainApplication.class)
@WebAppConfiguration
public class MainApplicationTests {

	@Test
	public void contextLoads() {
		
	}
}