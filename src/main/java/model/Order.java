package model;

public class Order {

    private int orderId;
    private int userId;
    private double totalAmount;
    private String paymentMethod;
    private String orderStatus;

    public Order() {}

    public Order(int orderId, int userId, double totalAmount,
                 String paymentMethod, String orderStatus) {

        this.orderId = orderId;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}