class Upi extends Payment {
	private String upiId;

	Upi(int paymentId, double amount, String status, String upiId) {
		super(paymentId, amount, status, upiId);
		this.upiId = upiId;
	}

	public String getUpiId() {
		return upiId;
	}

	@Override
	public void makePayment() {
		super.makePayment();
		System.out.println("Payment made using UPI ID: " + getUpiId());
	}

	@Override
	public void refundPayment() {
		super.refundPayment();
		System.out.println("Refund processed to UPI ID: " + getUpiId());
	}

	@Override
	public void checkStatus() {
		System.out.println("Your payment status is: " + getStatus());
	}

}