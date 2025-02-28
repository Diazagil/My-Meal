package myMeal;

public class Order {
	private User user;
	private Food food;
	private String desc;
	private static int count = 0;
	
	public Order(User user, Food food, String desc) {
		this.user = user;
		this.food = food;
		this.desc = desc;
		count++;
	}
	
	public User getUser() {
		return user;
		
	}
	
	public Food getFood() {
		return food;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static int getCount() {
		return count;
	}
}
