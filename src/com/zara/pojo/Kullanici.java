package com.zara.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="kullanici")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(Sehirler.class)
public class Kullanici {

	
	@XmlAttribute
	private int kullanicid;
	@XmlElement
	private String ad;
	@XmlElement
	private String soyad;
	
	@XmlElementWrapper(name="iletisim-numaralari")
	@XmlElement(name="telefon")
	private List<String> telefon;
	
	@XmlElementWrapper(name ="mail_adresleri")
	@XmlElement(name="posta")
	private List<String> eposta;
	
	private Sehirler sehir;

	public int getKullanicid() {
		return kullanicid;
	}

	public void setKullanicid(int kullanicid) {
		this.kullanicid = kullanicid;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public List<String> getTelefon() {
		return telefon;
	}

	public void setTelefon(List<String> telefon) {
		this.telefon = telefon;
	}

	public List<String> getEposta() {
		return eposta;
	}

	public void setEposta(List<String> eposta) {
		this.eposta = eposta;
	}

	public Sehirler getSehir() {
		return sehir;
	}

	public void setSehir(Sehirler sehir) {
		this.sehir = sehir;
	}

	@Override
	public String toString() {
		return "Kullanici [kullanicid=" + kullanicid + ", \nad=" + ad + ", \nsoyad=" + soyad + ", \ntelefon=" + telefon
				+ ", \neposta=" + eposta + ", \nsehir=" + sehir + "]";
	}
	
	
	
	
	
}
