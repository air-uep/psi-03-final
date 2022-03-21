package pl.air.vehicle.platform;

import pl.air.vehicle.model.Vehicle;

import java.util.*;

public class AdsPlatform {

    private List<Vehicle> vehicles;

    // ****************************************************************
    // Constructor

    public AdsPlatform(String text) {
        vehicles = new ArrayList<>();

        String[] array = text.split("\n");
        for (String line : array) {
            String[] data = line.split(";");

            String make = data[0];
            int year = Integer.valueOf(data[1]);
            int mileage = Integer.valueOf(data[2]);
            double price = Double.valueOf(data[3]);

            Vehicle v = new Vehicle(make, year, mileage, price);
            vehicles.add(v);
        }
    }

    // ****************************************************************

    /**
     * Zwraca listę ogłoszeń z samochodami o padanej marce (make)
     *
     * @param make marka samochodów
     * @return lista ogłoszeń z samochodami o podanej marce
     */
    public List<Vehicle> getByMake(String make) {
        List<Vehicle> list = new ArrayList<>();

        for (Vehicle veh : vehicles) {
            String vehMake = veh.getMake();
            if (vehMake.equals(make)) {
                list.add(veh);
            }
        }

        return list;
    }

    /**
     * Zwraca listę ogłoszeń z samochodami, których cena (price) zawiera się w podanym przedziale [min, max]
     *
     * @param min dolna granica przedziału
     * @param max górna granica przedziału
     * @return lista ogłoszeń z samochodami, których cena zawiera się w przedziale [min, max]
     */
    public List<Vehicle> getByPrice(double min, double max) {
        List<Vehicle> list = new ArrayList<>();

        for (Vehicle veh : vehicles) {
            double price = veh.getPrice();
            if (price >= min && price <= max) {
                list.add(veh);
            }
        }

        return list;
    }

    /**
     * Zwraca zestawienie marek samochodów (bez powtórzeń), znajdujących się na liście wszystkich ogłoszeń
     *
     * @return zbiór (Set) marek samochodów; zbiór - bez powtórzeń
     */
    public Set<String> getMakes() {
        Set<String> set = new HashSet<>();

        for (Vehicle one : vehicles) {
            String make = one.getMake();
            set.add(make);
        }

        return set;
    }

    /**
     * Zwraca zestawienie liczby ogłoszeń dla poszczególnych marek
     *
     * @return mapa (Map) w postaci: marka samochodu --> liczba ogłoszeń
     */
    public Map<String, Integer> getAdCount() {
        Map<String, Integer> map = new HashMap<>();

        for (Vehicle one : vehicles) {
            String make = one.getMake();

            Integer count = map.get(make);
            if (count == null) {
                count = 1;
            }
            else {
                count++;

            }
            map.put(make, count);
        }

        return map;
    }

    /**
     * Zwraca listę wszystkich ogłoszeń samochodowych
     *
     * @return lista wszystkich ogłoszeń samochodowych
     */
    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }

}
