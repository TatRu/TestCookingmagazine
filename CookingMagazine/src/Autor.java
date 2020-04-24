
public class Autor {
private String name;
private String familyname;

public Autor(String name, String familyname) {
	
	this.name = name;
	this.familyname = familyname;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFamilyname() {
	return familyname;
}

public void setFamilyname(String familyname) {
	this.familyname = familyname;
}
@Override
public String toString() {
	return "Autor name is:  " + name + " " + familyname ;
}
}
