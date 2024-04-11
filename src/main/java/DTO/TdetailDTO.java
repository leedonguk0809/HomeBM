package DTO;

public class TdetailDTO {
	private String TDetailID;
	private String TransactionID;
	private String ProductID;
	private int Purchase;
	private int UnitPrice;
	public TdetailDTO() {}
	
	public TdetailDTO(String tDetailID, String transactionID, String productID, int purchase, int unitPrice) {
		this.TDetailID = tDetailID;
		this.TransactionID = transactionID;
		this.ProductID = productID;
		this.Purchase = purchase;
		this.UnitPrice = unitPrice;
	}





	public String getTDetailID() {
		return TDetailID;
	}

	public void setTDetailID(String tDetailID) {
		TDetailID = tDetailID;
	}

	public String getTransactionID() {
		return TransactionID;
	}

	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	public int getPurchase() {
		return Purchase;
	}

	public void setPurchase(int purchase) {
		Purchase = purchase;
	}

	public int getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}
	
	
	
	
	
}
