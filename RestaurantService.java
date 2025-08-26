interface RestaurantService{
	public void showMenu();
	public void addDish(String newDish);
	public void updateDish(int index,String updatedDish);
	public void removeDish(int index);
}