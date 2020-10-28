package Lab_1;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog dg_1 = new Dog("Kaleb", 5);
        Dog dg_2 = new Dog("Gnar", 21);
        Dog dg_3 = new Dog("Cerber");
        dg_3.setAge(6);
        System.out.println(dg_1);
        dg_1.intoHumanAge();
        dg_2.intoHumanAge();
        dg_3.intoHumanAge();
    }
}

