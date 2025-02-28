package myMeal;
import java.util.*;

public class Food {
	private String name;
	private String desc;
	private int qty;
	private int calori;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Food(String name, String desc, int qty, int calori) {
		this.name = name;
		this.desc = desc;
		this.qty = qty;
		this.calori = calori;
		System.out.println(name + " was successfully added to the kitchen!");
	}
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public int getCalori() {
		return calori;
	}
	
	public void printIngredient() {
		int size = ingredients.size();
		for(int i=0; i<size; i++) {
			if(i != size-1) {
				System.out.print(ingredients.get(i).getName() + ", ");
			}
			else {
				System.out.println(ingredients.get(i).getName());
			}
		}
	}
}
