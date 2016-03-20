package br.ifrn.ssaac.persistence.dao;

import java.util.List;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.business.model.Student;

public interface  EventDAO {
	
	public List<Event> listActiveEvents();
	/*public List <Denuncia> carregarDenunciasUsuarioRN(Integer idUsuario){
		return denunciaDAO.carregarDenunciasUsuarioDao(idUsuario);
	}*/
	
}	
