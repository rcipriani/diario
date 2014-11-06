package br.com.diario.seguranca;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.diario.model.Usuario;

@Named
@SessionScoped
public class ControleAcesso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private List<Acesso> acessos;
	private Usuario usuario;

	
	public void logar(Usuario usuarioLogar){
	
		usuario = usuarioLogar;
		this.carregaAcessosPreDefinidosUsuario();
		
	}

	public boolean verificaAcesso(Acesso acesso) throws Exception {
		if(acessos != null && acessos.contains(acesso)){
			return true;
		}else{
			throw new Exception("Sem permissão para esta funcionalidade.");
		}

	}
	
	public boolean isUsuarioLogado(){
		return (usuario != null);
	}
	
	public void logout(){
		this.acessos = null;
		this.usuario = null;
	}
	
	/**
	 * Carregando estático, posteriormente da para fazer pegar de qualquer lugar
	 * */
	public void carregaAcessosPreDefinidosUsuario(){

//		acessos = new ArrayList<Acesso>();
//		if(usuario.getUsuarioTipo().equals(UsuarioTipoEnum.ADMIN.getCodigo())){
//			
//			acessos.add(Acesso.CADASTRAR_USUARIO);
//			acessos.add(Acesso.LISTAR_USUARIOS);
//			
//		}else if(usuario.getUsuarioTipo().equals(UsuarioTipoEnum.CLIENTE.getCodigo())){
//			
//			acessos.add(Acesso.CADASTRAR_USUARIO);
//			acessos.add(Acesso.LISTAR_USUARIOS);
//			
//		}else if(usuario.getUsuarioTipo().equals(UsuarioTipoEnum.LOJA.getCodigo())){
//			
//			acessos.add(Acesso.CADASTRAR_USUARIO);
//			acessos.add(Acesso.LISTAR_USUARIOS);
//			
//		}
		
	}
	 
	public List<Acesso> getAcessos() {
		return acessos;
	}

	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}