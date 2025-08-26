class User implements UserService {
	private static int idCounter = 1;
	private int userId;
	private String name;
	private long phone;
	private String address;

	User(int userId, String name, long phone, String address) {
		this.userId = idCounter++;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void displayProfile() {
		System.out.print("Current user");
	}

}