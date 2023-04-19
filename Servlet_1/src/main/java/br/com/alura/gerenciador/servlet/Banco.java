package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa_1 = new Empresa();
		empresa_1.setNome("Honda");
		
		Empresa empresa_2 = new Empresa();
		empresa_2.setNome("BMW");
		
		Banco.lista.add(empresa_1);
		Banco.lista.add(empresa_2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
