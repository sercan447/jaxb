package com.zara.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sehirler {

	
	@XmlAttribute
	private int num;
	@XmlElement
	private int plaka;
	@XmlElement
	private String sehiradi;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPlaka() {
		return plaka;
	}
	public void setPlaka(int plaka) {
		this.plaka = plaka;
	}
	public String getSehiradi() {
		return sehiradi;
	}
	public void setSehiradi(String sehiradi) {
		this.sehiradi = sehiradi;
	}
	@Override
	public String toString() {
		return "Sehirler [num=" + num + ", plaka=" + plaka + ", sehiradi=" + sehiradi + "]";
	}
	
	
	
	
	
}
