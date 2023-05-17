package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa alura = new Empresa();
		alura.setId(Banco.chaveSequencial++);
		alura.setNome("Alura");
		
		Empresa caelum = new Empresa();
		caelum.setId(Banco.chaveSequencial++);
		caelum.setNome("Caelum");
		
		lista.add(alura);
		lista.add(caelum);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = Banco.lista.iterator();
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id) {
				it.remove();
			}
		}	
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
