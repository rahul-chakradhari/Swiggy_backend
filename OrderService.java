interface OrderService{
	public void placeOrder();
	public void cancelOrder();
	public void trackOrder();
	public void updateStatus(String newStatus);
	
}