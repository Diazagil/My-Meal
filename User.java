package myMeal;

public class User {
	private String id;
	private String name;
	public User(String id, String name) {
		this.name = name;
		this.id = id;
	}	
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
}
