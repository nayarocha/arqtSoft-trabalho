package br.ifrn.ssaac.business.facade;

import java.util.List;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.EventBI;
import br.ifrn.ssaac.business.userbi.UserBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	private EventBI eventBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}
	
	
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}
	
	public List<Event> getActiveEvents(){
		return eventBI.getActiveEvents();
	}

	
}