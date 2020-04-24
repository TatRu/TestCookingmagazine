import java.util.List;

public class Ingridients {

private Vegetables vegetables;
private MelkAndProteinProducts melkAndProteinProducts;

public Ingridients() {
	
}

@Override
public String toString() {
	if(melkAndProteinProducts==null) {
		return  vegetables+"\n";
	} else {
		return melkAndProteinProducts+"\n";
	}
//	return  vegetables + ", " + melkAndProteinProducts ;
}

public Ingridients(MelkAndProteinProducts melkAndProteinProducts) {
	this.melkAndProteinProducts = melkAndProteinProducts;
}
public Ingridients(Vegetables vegetables) {
	this.vegetables = vegetables;
}
public Ingridients(Vegetables vegetables, MelkAndProteinProducts melkAndProteinProducts) {
	
	this.vegetables = vegetables;
	this.melkAndProteinProducts = melkAndProteinProducts;
}
public Vegetables getVegetables() {
	return vegetables;
}
public void setVegetables(Vegetables vegetables) {
	this.vegetables = vegetables;
}
public MelkAndProteinProducts getMelkAndProteinProducts() {
	return melkAndProteinProducts;
}
public void setMelkAndProteinProducts(MelkAndProteinProducts melkAndProteinProducts) {
	this.melkAndProteinProducts = melkAndProteinProducts;
}
}