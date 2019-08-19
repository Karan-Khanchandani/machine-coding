package entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<Item> cartItems;

    public Cart(List<Item> cartItems) {
        this.cartItems = cartItems;
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
    }

    public Cart addItem(Item item){
        if(this.cartItems == null){
            this.cartItems = new LinkedList<>();
        }
        this.cartItems.add(item);
        return this;
    }

    public Cart removeItem(Item item){
        if(this.cartItems == null) return this;
        if(this.cartItems.indexOf(item) >= 0){
            this.cartItems.remove(item);
        }
        return this;
    }

    public Cart clearCart(){
        this.cartItems.clear();
        return this;
    }
}
