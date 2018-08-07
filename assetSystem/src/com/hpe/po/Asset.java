package com.hpe.po;

public class Asset {

	private int bankId;
	private String cardNum;
	private double cardMoney;
	private String createDate;
	private int userId;
	public Asset() {
		super();
	}
	public Asset(int bankId, String cardNum, double cardMoney, String createDate, int userId) {
		super();
		this.bankId = bankId;
		this.cardNum = cardNum;
		this.cardMoney = cardMoney;
		this.createDate = createDate;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Asset [bankId=" + bankId + ", cardNum=" + cardNum + ", cardMoney=" + cardMoney + ", createDate="
				+ createDate + ", userId=" + userId + "]";
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public double getCardMoney() {
		return cardMoney;
	}
	public void setCardMoney(double cardMoney) {
		this.cardMoney = cardMoney;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
