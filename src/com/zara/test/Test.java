package com.zara.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.zara.pojo.Kullanici;

public class Test {

	public static void main(String[] args) {
		
		try {
		URL url = new URL("http://localhost:8096/_006_JAXB/rest/hizmetus/kulbil");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/xml");
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String veri = rd.readLine();
		
		//System.out.println(veri);
		
			con.disconnect();
		
			JAXBContext jaxbContext = JAXBContext.newInstance(Kullanici.class);
			Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
			Kullanici kullan = (Kullanici)jaxbunmarshaller.unmarshal(new StringReader(veri));
			
			System.out.println(kullan);
			
		}catch(MalformedURLException ep)
		{
			System.out.println("MALFORMED : "+ep.getMessage());
		}catch(IOException io){
			System.out.println("IOEXP : "+io.getMessage());
		}catch(JAXBException jax){
			System.out.println("JAX : "+jax.getMessage());
		}finally {
			
		}
		

	}

}
