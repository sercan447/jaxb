package com.zara.servis;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate;

import com.zara.pojo.Kullanici;
import com.zara.pojo.Kullanicilar;
import com.zara.pojo.Sehirler;

@Path("/hizmetus")
public class HizmetSaglayici {

	
			
		
	@Path("kulbil")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_XML)
	public Response KullaniciBilgi()
	{
		ArrayList<String> eposta = new ArrayList<String>();
						  eposta.add("sercan.goger@mynet.com");
						  eposta.add("q-veba@hotmail.com");
						  eposta.add("sercan.goger@gmail.com");
		List<String> telefon = new ArrayList<String>();	
					telefon.add("44444444444");
					telefon.add("88888888888");
					telefon.add("99999999999");
		Sehirler sehirler = new Sehirler();
				 sehirler.setNum(1);
				 sehirler.setPlaka(48);
				 sehirler.setSehiradi("Mugla");
		Kullanici kullanici = new Kullanici();
				  kullanici.setKullanicid(1);
				  kullanici.setAd("Kader");
				  kullanici.setSoyad("Beyoglu");
				  kullanici.setEposta(eposta);
				  kullanici.setTelefon(telefon);
				  kullanici.setSehir(sehirler);
				  
				  
	List<Kullanici> kullanicilar = new ArrayList<Kullanici>();
					kullanicilar.add(kullanici);
				  
		return Response.status(200).entity(kullanici).build();
	}//FUNC
	
	@Path("kulbil2")
	@GET
	//@Produces(MediaType.TEXT_XML) // COKLU VERI DONDURME DE HATA VERIYOR
	@Produces(MediaType.APPLICATION_XML)
	//@Produces(MediaType.APPLICATION_JSON)  // JSON DA VEREBILIYOR
	@Consumes(MediaType.TEXT_XML)
	public Response KullaniciBilgi2()
	{
		ArrayList<String> eposta = new ArrayList<String>();
						  eposta.add("sercan.goger@mynet.com");
						  eposta.add("q-veba@hotmail.com");
						  eposta.add("sercan.goger@gmail.com");
		List<String> telefon = new ArrayList<String>();	
					telefon.add("44444444444");
					telefon.add("88888888888");
					telefon.add("99999999999");
		Sehirler sehirler = new Sehirler();
				 sehirler.setNum(2);
				 sehirler.setPlaka(48);
				 sehirler.setSehiradi("Mugla");
		Kullanici kullanici1 = new Kullanici();
				  kullanici1.setKullanicid(1);
				  kullanici1.setAd("Kader");
				  kullanici1.setSoyad("Beyoglu");
				  kullanici1.setEposta(eposta);
				  kullanici1.setTelefon(telefon);
				  kullanici1.setSehir(sehirler);
				  
		 Kullanici kullanici2 = new Kullanici();
				  kullanici2.setKullanicid(2);
				  kullanici2.setAd("Gül");
				  kullanici2.setSoyad("ASLAN");
				  kullanici2.setEposta(eposta);
				  kullanici2.setTelefon(telefon);
				  kullanici2.setSehir(sehirler);		  
				  
	Kullanicilar kullanicilar = new Kullanicilar();
				kullanicilar.getListe().add(kullanici1);
				kullanicilar.getListe().add(kullanici2);
				  
		return Response.status(200).entity(kullanicilar).build();
	}
		
		
}
