package pro.sky.java.course2.hw5;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Auto> transports = new ArrayDeque<>();

    private void add(Auto auto) {
        transports.offer(auto);
    }

    public void addPassenger(Passenger passenger) {
        add(passenger);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void techService() {
        if (!transports.isEmpty()) {
            Auto auto = transports.poll();
            boolean result = auto.autoService();
            if (!result) {
                auto.repair();
            }
        }
    }

}
