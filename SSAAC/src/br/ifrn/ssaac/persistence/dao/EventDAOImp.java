package br.ifrn.ssaac.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class EventDAOImp implements EventDAO {
	private Connection conn;
	
	public EventDAOImp(){
		conn = ConnectionFactory.getInstance().getConnection();
	}
	
	
	@Override
	//Supondo que o status do evento no banco de dados seja:
	// 1 = ativo
	// 2 = cancelado
	// 3 = finalizado
	//será listado os eventos ativos cujo status seja 1
	public List<Event> listActiveEvents() {
		ResultSet rs;
		Event event = null;
		List<Event> events = new ArrayList<Event>();
		
		
		try {
			String sql = "SELECT * FROM Event WHERE status = "  + 1;
			PreparedStatement pstList = conn.prepareStatement(sql);
			rs = pstList.executeQuery(sql);
			
			while(rs.next()){
				event = new Event();
				event.setDate(rs.getString("date"));
				event.setNameEvent(rs.getString("nameEvent"));
				event.setStatus(rs.getInt("status"));
				events.add(event);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return events;
	}
	
	
	

}
