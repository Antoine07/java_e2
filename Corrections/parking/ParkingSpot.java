package parking;
public class ParkingSpot {

    private boolean occupied = false;
    private String place;

    ParkingSpot(String place){
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void occupy(){
        occupied = true;
    }

    public void free(){
        occupied = false;
    }

    public boolean getOccupied(){
        return occupied;
    }
    
}
