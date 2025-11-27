package parking;
import java.util.List;

public class ParkingStatistics {
    
    public int countFreeSpot(List<ParkingSpot> spots){
        int count = 0;
        for(ParkingSpot spot : spots){
            if( !spot.getOccupied() ) count++;
        }

        return count;
    }
}
