package parking;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ParkingManager manager = new ParkingManager();

        manager.addSpot(new ParkingSpot("A1"));
        manager.addSpot(new ParkingSpot("A2"));
        manager.addSpot(new ParkingSpot("A3"));
        manager.addSpot(new ParkingSpot("A4"));
        manager.addSpot(new ParkingSpot("B1"));
        manager.addSpot(new ParkingSpot("B2"));
        manager.addSpot(new ParkingSpot("B3"));
        manager.addSpot(new ParkingSpot("B4"));

        // placer 3 véhicules au place suivante A1 A4 et B2 
        for(ParkingSpot spot : manager.all()){
            if(spot.getPlace() == "A1"){
                spot.occupy();
            }
            if(spot.getPlace() == "A4"){
                spot.occupy();
            }

            if(spot.getPlace() == "B2"){
                spot.occupy();
            }
        }

        for(ParkingSpot spot : manager.all()){
            System.out.println(spot.getOccupied() + " " + spot.getPlace());
        }

        // le nombre de place(s) occupée(s)
        ParkingStatistics statistic = new ParkingStatistics();
        System.out.println(statistic.countFreeSpot(manager.all()));
    }
}
