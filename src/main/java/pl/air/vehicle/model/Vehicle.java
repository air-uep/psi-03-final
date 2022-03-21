package pl.air.vehicle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Vehicle {

    private String make;
    private int year;
    private int mileage;
    private double price;

}
