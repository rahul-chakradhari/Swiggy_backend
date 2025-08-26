class Order implements OrderService {
    private int orderId;
    private Customer customer;
    private Payment payment; 
    private double totalAmount;
    private String status;

    Order(int orderId, Customer customer, Payment payment, double totalAmount, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.payment = payment;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }
    public String getStatus() {
        return status;
    }

    public void placeOrder() {
        System.out.println("Order placed by " + customer.getName() + " and amount is " + getTotalAmount());
        status = "Placed";
	payment.makePayment();
    }

    public void cancelOrder() {
        System.out.println("Order " + getOrderId() + " cancelled");
        status = "Cancelled";
	payment.refundPayment();
    }

  

    public void trackOrder() {
        System.out.println("Current status of order " + getOrderId() + ": " + getStatus());
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Order " + getOrderId() + " status updated to: " + getStatus());
    }
}
