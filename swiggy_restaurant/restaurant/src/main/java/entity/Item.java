package entity;

import domain.Sensitivity;

public class Item {
    private Integer itemId;
    private String itemName;
    private Integer preparationTime; //Assumed time unit is minutes
    private Sensitivity sensitivity;
    private Integer maxDistanceCanTravel;

    public Item(Integer itemId, String itemName, Integer preparationTime, Sensitivity sensitivity, Integer maxDistanceCanTravel) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.preparationTime = preparationTime;
        this.sensitivity = sensitivity;
        this.maxDistanceCanTravel = maxDistanceCanTravel;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Sensitivity getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(Sensitivity sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Integer getMaxDistanceCanTravel() {
        return maxDistanceCanTravel;
    }

    public void setMaxDistanceCanTravel(Integer maxDistanceCanTravel) {
        this.maxDistanceCanTravel = maxDistanceCanTravel;
    }
}
