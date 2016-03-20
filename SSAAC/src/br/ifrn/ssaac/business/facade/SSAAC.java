package br.ifrn.ssaac.business.facade;

import java.util.List;

import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.business.model.Student;

public interface SSAAC {
	public void addStudentAuthor(Student student);
	public List<Event> getActiveEvents();
}