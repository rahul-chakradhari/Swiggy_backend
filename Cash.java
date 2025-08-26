class Cash extends Payment {
	private String cash;

	Cash(int paymentId, double amount, String status, String cash) {
		super(paymentId, amount, status, cash);
		this.cash = cash;
	}

	public String getCash() {
		return cash;
	}

	@Override
	public void makePayment() {
		super.makePayment();
		System.out.println("Payment made using Cash of  : " + getCash() + " with amount " + getAmount());

	}

	@Override
	public void refundPayment() {
		super.refundPayment();
		System.out.println("Refund processed to Cash of : " + getCash() + " with amount " + getAmount());
	}

	@Override
	public void checkStatus() {
		System.out.println("Your payment status is: " + getStatus());
	}

}