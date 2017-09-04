package basic.visitor;

import java.util.Iterator;

import basic.composite.FileTreatmentException;

public abstract class Entry implements Element {
	public abstract String getName();
	public abstract int getSize();
	
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	
	public Iterator<Entry> iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
