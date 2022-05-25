package lecture.dynamic_array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AirPlan airPlan = new AirPlan();
        Bird bird = new Bird();
        bird.fly();
        Space space = new Space();
        space.fly();



        ArrayList<Flyable> list = new ArrayList<>();
        list.add(bird);
        list.add(airPlan);

    }
}
