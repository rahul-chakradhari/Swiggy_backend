class Customer extends User {
	Customer(int userId, String name, long phone, String address) {
		super(userId, name, phone, address);
	}

	@Override
	public void displayProfile() {
		System.out.println("Current user is customer");
	}
}