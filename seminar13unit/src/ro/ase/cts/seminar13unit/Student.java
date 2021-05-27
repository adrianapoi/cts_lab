package ro.ase.cts.seminar13unit;

import ro.ase.cts.seminar13unit.exceptions.StudentExceptionWrongValue;

public class Student {
	/* contsraints
	 * nume - [3-255] caractere
	 * varsta - [18-30]
	 * note - [1, 10]
	 */
String nume;
int varsta;
int note[];
public Student(String nume, int varsta, int[] note) {
	super();
	this.nume = nume;
	this.varsta = varsta;
	this.note = note;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public int getVarsta() {
	return varsta;
}
public void setVarsta(int varsta) throws StudentExceptionWrongValue {
	if(varsta<0)
		throw new StudentExceptionWrongValue("Value can't be belox 0");
	this.varsta = varsta;
}
public int[] getNote() {
	return note;
}
public void setNote(int[] note) {
	this.note = note;
}


}