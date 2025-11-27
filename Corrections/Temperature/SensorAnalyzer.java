package temperature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SensorAnalyzer {
    List<Double> values;

    SensorAnalyzer(List<Double> values) {
        this.values = values;
    }

    double average() {
        double s = 0;
        for (double v : values) {
            s += v;
        }

        if (values.size() == 0)
            return 0.0;

        return this.precision(s / values.size());
    }

    double median() {
        // copie des valeurs de temperatures
        List<Double> copy = new ArrayList<>(values);
        Collections.sort(copy);

        int s = copy.size();

        // 10, 11, 12, 13, 14 => 5/2 = 2
        // 10, 11, 12, 13, 14, 15, 16 => 7/2 = 3
        if (s % 2 == 1)
            return copy.get(s / 2);

        // 10, 11, 12, 13 => 4/2 = 2 => 2-1 = 1 et 2
        // 10, 11, 12, 13, 14, 15 => 6/2 = 3 => 3-1 = 2 et 3
        return this.precision(((copy.get(s / 2 - 1) + copy.get(s / 2)) / 2.0));
    }

    double precision(double v) {
        return Math.round(v * 10.0 / 10.0); // pour arrondir avec une décimale après la virgule
    }

    List<Double> outliers() {
        List<Double> out = new ArrayList<>();

        // this est optionnel on peut appeler la fonction directement this.average() ou
        // average
        double avg = average();

        for (int i = 0; i < values.size(); i++) {
            double v = values.get(i); // primitif
            if (v < avg - 5 || v > avg + 5) {
                out.add(v);
            }
        }

        return out;

    }
}