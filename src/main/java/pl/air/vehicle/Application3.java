package pl.air.vehicle;

import pl.air.vehicle.model.Vehicle;
import pl.air.vehicle.platform.AdsPlatform;
import pl.air.vehicle.service.DataService;
import pl.air.vehicle.service.PrintService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application3 {

    public static void main(String[] args) {
        String dataText = DataService.getDataAsText();
        AdsPlatform platform = new AdsPlatform(dataText);

        List<Vehicle> fords = platform.getByMake("Ford");
        PrintService.printVehicles(fords, "Lista ogłoszeń dla marki Ford");

        List<Vehicle> cheapVehicles = platform.getByPrice(500, 2000);
        PrintService.printVehicles(cheapVehicles, "Lista ogłoszeń z ceną w przedziale [500, 2000]");

        Set<String> makes = platform.getMakes();
        System.out.println(makes);

        Map<String, Integer> adCount = platform.getAdCount();
        System.out.println(adCount);
    }
}
