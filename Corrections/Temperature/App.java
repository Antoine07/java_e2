package Temperature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Double[] temperatures = { 18.5, 19.0, 20.1, 21.3, 22.0,
                17.8, 18.2, 19.6, 20.4, 21.7,
                22.5, 23.1, 19.9, 18.7, 17.5,
                16.8, 20.0, 21.1, 22.3, 23.7,
                19.4, 18.9, 20.7, 21.8, 22.6,
                23.2, 17.9, 18.4, 19.2, 20.5, 27.0, -18.0, 45.0, 100.0  };

        List<Double> tempList =  new ArrayList<>(Arrays.asList(temperatures));

        SensorAnalyzer sensorAnalyzer = new SensorAnalyzer(tempList);

        System.out.println("Average temperature: " + sensorAnalyzer.average());
        System.out.println("Median temperature: " + sensorAnalyzer.median());

        for(double out :sensorAnalyzer.outliers() ){
            System.out.print(out);
        }
    }
}
