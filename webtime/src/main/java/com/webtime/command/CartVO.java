package com.webtime.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CartVO {

	private int cno;
	private String user_id;
	private int num;
	private String title;
	private int price;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartVO [cno=" + cno + ", user_id=" + user_id + ", num=" + num + ", title=" + title + ", price=" + price
				+ "]";
	}
	public CartVO(int cno, String user_id, int num, String title, int price) {
		super();
		this.cno = cno;
		this.user_id = user_id;
		this.num = num;
		this.title = title;
		this.price = price;
	}
public CartVO() {
	}
}
