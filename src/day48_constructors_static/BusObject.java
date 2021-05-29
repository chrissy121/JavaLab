package day48_constructors_static;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Chrissy");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        //print driver name of MetroBus

        System.out.println(metroBus.driver.getName());

    }
}
