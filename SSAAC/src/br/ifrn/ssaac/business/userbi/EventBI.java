package br.ifrn.ssaac.business.userbi;

import java.util.List;

import br.ifrn.ssaac.business.model.Event;

public interface EventBI {
	public List<Event> getActiveEvents();
}
