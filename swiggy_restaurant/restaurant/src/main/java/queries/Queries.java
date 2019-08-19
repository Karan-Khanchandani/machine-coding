package queries;

import entity.Customer;
import entity.Item;
import entity.Restaurant;

import java.util.List;
import java.util.stream.Collectors;

import static domain.Location.distanceBetween;

public class Queries {
    public List<Restaurant> query1(List<Restaurant> restaurants,Customer customer, double radius){
        return restaurants.stream()
                .filter((restaurant) -> (distanceBetween(customer.getLocation(), restaurant.getLocation()) <= radius))
                .collect(Collectors.toList());
    }

    public Integer findSLAEasy(Restaurant restaurant, Customer customer, double speed) throws Exception{
        double distanceBetweenCustomerAndRestaurant = distanceBetween(customer.getLocation(), restaurant.getLocation());
        int maxPrepTime = 0;
        for(Item item : customer.getCart().getCartItems()){
            if(distanceBetweenCustomerAndRestaurant > item.getMaxDistanceCanTravel()){
                throw new Exception("Cannot fulfil order as the item " + item.getItemName() + " cannot be delivered in the given time");
            }
            //Assuming things can be prepared in parallel
            maxPrepTime = Math.max(maxPrepTime, item.getPreparationTime());
        }
        double totalTime = Math.ceil(distanceBetweenCustomerAndRestaurant/speed) + maxPrepTime;
        return (int) totalTime;
    }
}
