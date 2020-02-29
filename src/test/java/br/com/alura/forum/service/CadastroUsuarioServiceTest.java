package br.com.alura.forum.service;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.alura.forum.dao.PerfilDao;
import br.com.alura.forum.dao.UsuarioDao;

public class CadastroUsuarioServiceTest {

	@Test
	public void deve_lancar_excecao_quando_ja_existe_o_usuario() {
		UsuarioDao dao = Mockito.mock(UsuarioDao.class);
		PerfilDao perfilDao = Mockito.mock(PerfilDao.class);
		Md5Service md5Service = Mockito.mock(Md5Service.class);
		//CadastroUsuarioService service = new CadastroUsuarioService(dao);
		
	}

}
