import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Autor> autor = new ArrayList<>();
		autor.add(new Autor("Bob", "Kok"));
		autor.add(new Autor("Van", "Dum"));
		autor.add(new Autor("Tat", "Jac"));
		autor.add(new Autor("Luk", "Muk"));
		
		for (Autor a : autor) {
			System.out.println(a);	
		}

	
		
		List<Ingridients> ingridients = new ArrayList<>();
		ingridients.add(new Ingridients (Vegetables.Bananas));
		ingridients.add(new Ingridients (Vegetables.Carrort));
		ingridients.add(new Ingridients (Vegetables.Potato));
	     System.out.println(ingridients.toString());	
		
		List<Ingridients> ingridients1 = new ArrayList<>();
		ingridients1.add(new Ingridients (MelkAndProteinProducts.Eggs));
		ingridients1.add(new Ingridients (MelkAndProteinProducts.Milk));
		ingridients1.add(new Ingridients (Vegetables.Potato));
		ingridients.add(new Ingridients (Vegetables.Carrort));
		System.out.println(ingridients.toString());	
		
		List<Ingridients> ingridients2 = new ArrayList<>();
		ingridients2.add(new Ingridients (MelkAndProteinProducts.Chees));
		ingridients2.add(new Ingridients (MelkAndProteinProducts.Chicken));
		ingridients2.add(new Ingridients (Vegetables.Potato));
		ingridients2.add(new Ingridients (Vegetables.Carrort));
		System.out.println(ingridients.toString());	
		

		
		List<Recipe> recipe1 = new ArrayList<>();
		Recipe salat= new Recipe("Salat",autor.get(1) , ingridients, "Receptire");
		Recipe panake= new Recipe("Panake", autor.get(3) , ingridients1, "Receptire");
		recipe1.add(salat);
		recipe1.add(panake);
		
		
		List<Recipe> recipe2 = new ArrayList<>();
		Recipe chicken=new Recipe("Chicken",autor.get(2) , ingridients2, "Receptire");
		recipe2.add(chicken) ;
	
		
		
		List<CookingMagazine> allMagazines = new ArrayList<>();
		CookingMagazine cookingMagazine1=new CookingMagazine("Lekker",recipe1);
		CookingMagazine cookingMagazine2=new CookingMagazine("Burda",recipe2);
		allMagazines.add(cookingMagazine1);
		allMagazines.add(cookingMagazine2);
//		allMagazines.set(1, cookingMagazine1);//update magazin
		
//		allMagazines.remove(cookingMagazine1);
		allMagazines.get(0).getRecepten().remove(1);//remove recept
		allMagazines.get(0).getRecepten().add(panake);//add recept
		

		
		System.out.println(allMagazines.get(0));
		
		System.out.println("=========================");
		
//		for (CookingMagazine cookingMagazine : allMagazines) {
//			System.out.println(cookingMagazine.getNaam());
//		}
		
		allMagazines.sort((mag1,mag2)->mag1.getNaam().compareTo(mag2.getNaam()));
		
		System.out.println(allMagazines.toString());
	}
	
}
