import java.util.Arrays;
import java.util.List;

public class Recipe  {



private String naamRecipe;
private Autor autorRecipe;
private List<Ingridients> ingridients;
private String proceture;

public Recipe(String naamRecipe, Autor autorRecipe, List<Ingridients> ingridients, String proceture) {
	
	this.naamRecipe = naamRecipe;
	this.autorRecipe = autorRecipe;
	this.ingridients = ingridients;
	this.proceture = proceture;
}

public String getNaamRecipe() {
	return naamRecipe;
}
public void setNaamRecipe(String naamRecipe) {
	this.naamRecipe = naamRecipe;
}
public Autor getAutorRecipe() {
	return autorRecipe;
}



public void setAutorRecipe(Autor autorRecipe) {
	
	this.autorRecipe = autorRecipe;
}
public String getProceture() {
	return proceture;
}
public void setProceture(String proceture) {
	this.proceture = proceture;
}

public List<Ingridients> getIngridients() {
	return ingridients;
}

public void setIngridients(List<Ingridients> ingridients) {
	this.ingridients = ingridients;
}

@Override
public String toString() {
	return "Recipe " + naamRecipe + autorRecipe + ", ingridients :" + ingridients
			 + proceture ;
}




}


