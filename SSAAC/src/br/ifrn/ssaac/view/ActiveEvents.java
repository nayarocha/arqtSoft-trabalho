package br.ifrn.ssaac.view;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.ssaac.business.facade.SSAAC;
import br.ifrn.ssaac.business.factory.SSAACFactory;
import br.ifrn.ssaac.business.model.Event;

@WebServlet("/activeEvents")
public class ActiveEvents extends HttpServlet{
	private List<Event> getActiveEvents;  
	public ActiveEvents() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		SSAAC facade = SSAACFactory.getInstance().getFacade();
		facade.getActiveEvents();
		
	}
}
