package com.app.model;

public class Cart {
	private int cartid;
	private String cartname;
	private double cartsal;
	public Cart(int cartid, String cartname, double cartsal) {
		super();
		this.cartid = cartid;
		this.cartname = cartname;
		this.cartsal = cartsal;
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", cartname=" + cartname + ", cartsal=" + cartsal + "]";
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getCartname() {
		return cartname;
	}
	public void setCartname(String cartname) {
		this.cartname = cartname;
	}
	public double getCartsal() {
		return cartsal;
	}
	public void setCartsal(double cartsal) {
		this.cartsal = cartsal;
	}
	

}
