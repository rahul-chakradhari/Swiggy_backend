class Card extends Payment {
	private String cardId;

	Card(int paymentId, double amount, String status, String cardId) {
		super(paymentId, amount, status, cardId);
		this.cardId = cardId;
	}

	public String getCardId() {
		return cardId;
	}

	@Override
	public void makePayment() {
		super.makePayment();
		System.out.println("Payment made using Card ID: " + getCardId());
	}

	@Override
	public void refundPayment() {
		super.refundPayment();
		System.out.println("Refund processed to Card ID: " + getCardId());
	}

	@Override
	public void checkStatus() {
		System.out.println("Your payment status is: " + getStatus());
	}

}