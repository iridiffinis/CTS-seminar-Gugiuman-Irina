package cts.seminar.transport.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuze {
	private List<AutobuzMemento> listaMemento = new ArrayList<AutobuzMemento>();
	
	public void adaugaMemento(AutobuzMemento memento)
	{
		this.listaMemento.add(memento);
	}
	
	public AutobuzMemento getMemento(int poz)
	{
		return this.listaMemento.get(poz);
	}
}
