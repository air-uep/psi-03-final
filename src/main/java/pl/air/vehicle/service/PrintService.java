package pl.air.vehicle.service;

import pl.air.vehicle.model.Vehicle;

import java.util.List;

public class PrintService {

    public static void printVehicles(List<Vehicle> list, String header) {
        printHeader(header);

        System.out.println(" Marka    | Rocznik | Przebieg   | Cena         ");
        System.out.println("----------+---------+------------+--------------");

        for (Vehicle one : list) {
            printOneVehicle(one);
        }

        System.out.println();
    }

    public static void printHeader(String header) {
        System.out.println(header);
        String underline = header.replaceAll(".", "=");
        System.out.println(underline);
    }

    private static void printOneVehicle(Vehicle one) {
        String make = one.getMake();
        int year = one.getYear();
        int mileage = one.getMileage();
        double price = one.getPrice();

        String printout = String.format(" %-8s | %-7d | %,7d km | %,9.2f zł", make, year, mileage, price);

        System.out.println(printout);
    }

}
