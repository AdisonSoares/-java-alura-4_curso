package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuario = new ArrayList<>();
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
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("nico");
		usuario1.setSenha("12345");
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("ana");
		usuario2.setSenha("12345");
		
		listaUsuario.add(usuario1);
		listaUsuario.add(usuario2);
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

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario cadaUsuario : listaUsuario) {
			if(cadaUsuario.ehIgual(login, senha)) {
				return cadaUsuario;
			}
		}
		
		return null;
	}
}





















