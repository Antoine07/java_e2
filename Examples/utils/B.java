package utils;

import app.A;

public class B  {
    public void run() {
        A a = new A(); // ✔ OK
        System.out.println(a.x); // ✔ OK
        // System.out.println(a.y); // private pas visible
        a.show();

        
    }
}
