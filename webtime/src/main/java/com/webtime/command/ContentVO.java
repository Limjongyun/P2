package com.webtime.command;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ContentVO {
	private int num;
	private String id;
	private String user_name;
	private String title;
	private String bank;
	private String card_num;
	private String seat_num;
	private int price;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

	public String getSeat_num() {
		return seat_num;
	}

	public void setSeat_num(String seat_num) {
		this.seat_num = seat_num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ContentVO [num=" + num + ", id=" + id + ", user_name=" + user_name + ", title=" + title + ", bank="
				+ bank + ", card_num=" + card_num + ", seat_num=" + seat_num + ", price=" + price + "]";
	}
	
}
