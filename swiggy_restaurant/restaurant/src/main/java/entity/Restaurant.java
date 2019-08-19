package entity;

import domain.Location;

import java.util.LinkedList;
import java.util.List;

public class Restaurant {
    private Integer restaurantId;
    private Location location;
    private String name;
    private List<Item> menuItems;


    public Restaurant(Integer restaurantId, Location location, String name, List<Item> menuItems) {
        this.restaurantId = restaurantId;
        this.location = location;
        this.name = name;
        this.menuItems = menuItems;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

    public Restaurant addMenuItem(Item item){
        if(this.menuItems == null){
            this.menuItems = new LinkedList<>();
        }
        this.menuItems.add(item);
        return this;
    }

    public Restaurant removeItem(Item item){
        if(this.menuItems == null) return this;
        if(this.menuItems.indexOf(item) >= 0){
            this.menuItems.remove(item);
        }
        return this;
    }

    public Restaurant clearMenu(){
        this.menuItems.clear();
        return this;
    }
}
