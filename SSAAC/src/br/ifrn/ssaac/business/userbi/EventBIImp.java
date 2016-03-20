package br.ifrn.ssaac.business.userbi;

import java.util.List;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.persistence.dao.EventDAO;
import br.ifrn.ssaac.persistence.dao.EventDAOImp;

public class EventBIImp implements EventBI {
	private EventDAO dao = new EventDAOImp();
	
	public EventBIImp(){
		
	}
	
	@Override
	public  List<Event> getActiveEvents() {
		return dao.listActiveEvents();
	
	}

}
