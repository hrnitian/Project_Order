package com.sapient.client.cui;

public class Item {

	int shippingWeight;
	int description;
	double priceForQuantity;
	OrderDetail orderDetail;
	
	
	public int getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(int shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public int  getDescription() {
		return description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDeal(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public double getPriceForQuantity()
	{
		return priceForQuantity;
	}
	public void setPriceForQuantity(double price)
	{
		this.priceForQuantity=price;
	}
	
	public double getWeight()
	{
		return shippingWeight*0.8;
	}
	
}
	
