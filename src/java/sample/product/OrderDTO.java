/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.product;

/**
 *
 * @author OS
 */
public class OrderDTO extends ProductDTO{
   private int orderID;
   private int uid;
   private int quantity;
   private String date;
   public OrderDTO(){}

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public OrderDTO(int orderID, int uid, int quantity, String date) {
        super();
        this.orderID = orderID;
        this.uid = uid;
        this.quantity = quantity;
        this.date = date;
    }
   public OrderDTO(int uid, int quantity, String date) {
		super();
		this.uid = uid;
		this.quantity = quantity;
		this.date = date;
	}
   
   
   
    
}
