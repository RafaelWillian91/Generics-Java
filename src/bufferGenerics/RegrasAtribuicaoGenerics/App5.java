package bufferGenerics.RegrasAtribuicaoGenerics;

import java.util.ArrayList;
import java.util.List;

public class App5 {

    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);

        driveVehicles(vehicles);

        List<Vehicle.Car> cars = new ArrayList<>();
        cars.add(car);

      //  driveVehicles(cars); Esse codido não compila pq uma das regras do Generics é que não se pode passar
        // uma lista de um Tipo Diferente da Lista que pede no Generics. Posso adicionar como foi feito em
        //List<Vehicle> vehicles = new ArrayList<>();
        //Mas nao posso chamar o método private static void driveVehicles(List<Vehicle> vehicleList) passando
        //uma lista de Car diretamente.

    }

    private static void driveVehicles(List<Vehicle> vehicleList){

        for (Vehicle v: vehicleList){
            v.drive();
        }
    }

}
