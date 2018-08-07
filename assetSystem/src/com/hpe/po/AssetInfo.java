package com.hpe.po;

import java.util.Date;

public class AssetInfo {

	private int userId;
	private String userName;
	private int bankId;
	private String bankName;
	private String cardNum;
	private double cardMoney;
	private Date createDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public AssetInfo(int userId, String userName, int bankId, String bankName, String cardNum,double cardMoney,
			Date createDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.bankId = bankId;
		this.bankName = bankName;
		this.cardNum = cardNum;
		this.cardMoney = cardMoney;
		this.createDate = createDate;
	}
	public AssetInfo() {
		super();
	}
	@Override
	public String toString() {
		return "AssetInfo [userId=" + userId + ", userName=" + userName + ", bankId=" + bankId + ", bankName="
				+ bankName + ", cardNum=" + cardNum + ", cardMoney=" + cardMoney + ", createDate=" + createDate + "]";
	}
	
	
	
	
}
