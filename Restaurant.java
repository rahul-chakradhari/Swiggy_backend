class Restaurant implements RestaurantService {
	private static int idCounter = 1000;
	private int restaurantId;
	private String cuisineType;
	private double rating;

	public int getRestaurantId() {
		return restaurantId;
	}

	private String[] dishes = new String[10];
	private int count = 0;

	public double getRating() {
		return rating;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	Restaurant(int restaurantId, String cuisineType, double rating) {
		this.restaurantId = idCounter++;
		this.cuisineType = cuisineType;
		this.rating = rating;
	}

	public void showMenu() {
		System.out.print("Menu :");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + dishes[i]);
		}
		if (count == 0)
			System.out.println("No dishes available yet.");

	}

	public void addDish(String newDish) {
		if (count < dishes.length) {
			dishes[count] = newDish;
			count++;
			System.out.println("Dish added: " + newDish);

		} else
			System.out.print("Cart is full ! Cannot add new Dish now");

	}

	public void updateDish(int index, String updatedDish) {
		if (index >= 0 && index < count) {
			dishes[index] = updatedDish;
			System.out.println("Dish at position " + (index + 1) + " updated to: " + updatedDish);

		} else
			System.out.println("Invalid dish index!");

	}

	public void removeDish(int index) {
		if (index >= 0 && index < count) {
			System.out.println("Removed dish: " + dishes[index]);
			dishes[index] = null;
		} else {
			System.out.println("Invalid dish index!");
		}
	}

}