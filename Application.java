package myMeal;
import java.util.*;

public class Application {
	private static ArrayList<Food> foods = new ArrayList<>();
	private static ArrayList<Order> orders = new ArrayList<>();
	public void addNewFood(Food food) {
		foods.add(food);
	}
	
	public void displayFoods() {
		System.out.println("Food List :");
		System.out.println("-----------------------------------");
		if(foods.size() == 0) {
			System.out.println("There is no food list");
			return;
		}
		for(Food food : foods) {
			System.out.println(food.getName() + " (" + food.getCalori() +")");
			System.out.println("Description:  " + food.getDesc());
			System.out.println("Spicy level: " + food.getQty());
			System.out.println("Ingredients: ");
			food.printIngredient();
			System.out.println("--------------------------------");
		}
	}
	
	public void order(User user, Food food, String date) {
		Order order = new Order(user, food, date);
		orders.add(order);
		System.out.println(user.getName() + " ordered Bento on " + date);
	}
	
	public void displayOrders() {
		System.out.println("Order List: ");
		System.out.println("-------------------");
		for(Order order : orders) {
			System.out.println("User: " + order.getUser().getName() + " - " + order.getUser().getId());
			System.out.println("Food: " + order.getFood().getName());
			System.out.println("Date: " + order.getDesc());
			System.out.println("-----------------------------");
		}
	}
}
