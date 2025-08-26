class Payment implements PaymentService {
    private double amount;
    private String paymentMode;
    private String status;
    private boolean isPaid = false;

    Payment(int paymentId, double amount, String paymentMode, String status) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.status = status;
    }

    public void makePayment() {
        System.out.println("Payment of " + amount + " via " + paymentMode + " is being processed.");
        status = "Completed";
        isPaid = true;
    }

    public void refundPayment() {
        if (isPaid) {
            System.out.println("Refund of " + amount + " processed successfully!");
            status = "Refunded";
            isPaid = false;
        } else {
            System.out.println("Refund not possible! No payment done yet.");
        }
    }

    public void checkStatus() {
        System.out.println("Payment status: " + status);
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public String getStatus() {
        return status;
    }
}
