package model;

import java.time.LocalDateTime;



public class Bill {

    public int orderId;
    private String timestamp;
    private String clientName;
    private String productName;
    private int quantity;

    public Bill() {
    }

    public Bill(int orderId, String timestamp, String clientName, String productName, int quantity) {
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.clientName = clientName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "orderId=" + orderId +
                ", timestamp='" + timestamp + '\'' +
                ", clientName='" + clientName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}