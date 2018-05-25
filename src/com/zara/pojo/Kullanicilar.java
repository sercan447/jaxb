package com.zara.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="kullanicilar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Kullanicilar {
	
	@XmlElement
	List<Kullanici> liste = new ArrayList<Kullanici>();

	public List<Kullanici> getListe() {
		return liste;
	}

	public void setListe(List<Kullanici> liste) {
		this.liste = liste;
	}
	
	
	

}
