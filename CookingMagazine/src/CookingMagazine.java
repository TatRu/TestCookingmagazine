//import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;
//import java.util.Map;

public class CookingMagazine {
private String naam;

private List<Recipe> recepten;

public CookingMagazine(String naam, List<Recipe> recepten) {
	
	this.naam = naam;
	this.recepten = recepten;
}

public CookingMagazine(String naam) {
	this.naam=naam;
}

public String getNaam() {
	return naam;
}

public void setNaam(String naam) {
	this.naam = naam;
}

public List<Recipe> getRecepten() {
	return recepten;
}

public void setRecepten(List<Recipe> recepten) {
	this.recepten = recepten;
}

@Override
public String toString() {
	return "CookingMagazine naam=" + naam + ", recepten=" + recepten + "]";
}

//@Override
//public int compareTo(CookingMagazine magaz) {
//	
//	return this.naam.compareTo(magaz.getNaam());
//}

//@Override
//public int compare(Object mag1, Object mag2) {
//	CookingMagazine magazin1=(CookingMagazine)mag1;
//	CookingMagazine magazin2=(CookingMagazine)mag2;
//	if(magazin1.naam ==magazin2.getNaam()) {
//		return 1;
//	}
//	return -1;
//}

}




