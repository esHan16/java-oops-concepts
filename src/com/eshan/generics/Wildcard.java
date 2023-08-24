package com.eshan.generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private int vehicleID;

    public Vehicle(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID=" + vehicleID +
                '}';
    }

    public void info(){
        System.out.println(getVehicleID());
    }
}
class Car extends Vehicle {
    private String carModel;

    public Car(String carModel, int vehicleID) {
        super(vehicleID);
        this.carModel = carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                "} " + super.toString();
    }
    @Override
    public void info(){
        System.out.println(getCarModel());
    }
}
public class Wildcard {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(123));
        list.add(new Vehicle(234));
        list.add(new Vehicle(345));
        list.add(new Vehicle(456));
        list.add(new Vehicle(567));
        list.add(new Vehicle(678));
        list.add(new Car("A - Class",987));
        list.add(new Car("C - Class",876));
        list.add(new Car("E - Class",765));
        list.add(new Car("S - Class",654));
        new Wildcard().display(list);
    }

//    public void display(List<?> list){ /** <?> - notation is used for wildcard, it you are not confirmed about the type of parameter</?>*/
//        for(Object element : list){
//            System.out.println(element.toString());
//        }
//    }
//
    public void display(List<? extends Vehicle> list) { /** using extend keyword for giving upper bound*/
        for (Vehicle element : list) {
//            System.out.println(element.toString());
            element.info();

        }
    }
//    public void display(List<? super Car> list) { /** using super keyword for specifying the type itself or its parent class type for the list*/
//        for (Object element : list) {
//            System.out.println(element.toString());
//        }
//    }
}

