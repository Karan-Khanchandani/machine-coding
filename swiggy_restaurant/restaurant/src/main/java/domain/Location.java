package domain;

public class Location {
    private double latitude;
    private double longitude;

    public Location(){}

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static double distanceBetween(Location location1, Location location2){
        return Math.abs(Math.hypot(location1.latitude - location2.latitude, location1.longitude - location2.longitude));
    }
}
