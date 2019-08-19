package entity;

import domain.Location;

public class Customer {
    private Integer customerId;
    private Cart cart;
    private Location location;

    public Customer(Integer customerId, Cart cart, Location location) {
        this.customerId = customerId;
        this.cart = cart;
        this.location = location;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
