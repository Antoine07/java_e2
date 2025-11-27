package parking;
import java.util.ArrayList; // objet qui permet de faire du stockage de valeur
import java.util.List; // type

public class ParkingManager {
    // une liste de ParkingSpot obligatoire lors du typage 
    private List<ParkingSpot> spots = new ArrayList<>();

    public void addSpot(ParkingSpot spot){
        if( !spots.contains(spot) ){
            spots.add(spot);
        }
    }

    public List<ParkingSpot> all(){
        return spots;
    }
}
