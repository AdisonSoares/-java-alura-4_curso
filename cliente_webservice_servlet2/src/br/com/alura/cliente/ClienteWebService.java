package br.com.alura.cliente;

import org.apache.hc.client5.http.fluent.Request;

public class ClienteWebService {
	public static void main(String[] args) throws Exception{
		
		String conteudo = Request
			    .post("http://localhost:8080/gerenciador/empresas")
			    .addHeader("Accept", "application/xml")
			    .execute()
			    .returnContent()
			    .asString();

			System.out.println(conteudo);
		
	}

}
