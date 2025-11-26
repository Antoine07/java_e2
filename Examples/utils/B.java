package utils;
import app.A;

public class B {
    void run() {
        A a = new A();  // ✔ OK
        System.out.println(a.x); // ✔ OK
    }
}
