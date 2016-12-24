package br.com.nuvemapp.exemploclientpostmonapijava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CidadeInfo {
	
	@XmlElement(name = "area_km2")
	private String area_km2;
	
	@XmlElement(name = "codigo_ibge")
	private String codigo_ibge;

	public String getArea_km2() {
		return area_km2;
	}

	public void setArea_km2(String area_km2) {
		this.area_km2 = area_km2;
	}

	public String getCodigo_ibge() {
		return codigo_ibge;
	}

	public void setCodigo_ibge(String codigo_ibge) {
		this.codigo_ibge = codigo_ibge;
	}
	
	
}
