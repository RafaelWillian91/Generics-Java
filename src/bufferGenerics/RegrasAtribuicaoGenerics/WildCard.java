package bufferGenerics.RegrasAtribuicaoGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {


    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);

        driveVehicles(vehicles);
        System.out.println("------------------------");


        List<Vehicle.Car> cars = new ArrayList<>();
        cars.add(car);
        driveVehicles(cars);

        //Para evitar o problema da passagem de parametro para métodos.
        //Foram criados os wildCard (Caracter Curinga no java)//
        List<? extends Vehicle> vehicleList = new ArrayList<Vehicle>();
       //vehicleList.add(bus); Erro de Comilacao, pq o compliador nao pode garantir o tipo que sera adiconado
        vehicleList.get(0);

        //Uma das funcoes do Generics é dar protecao em tempo de compilacao a respeito do tipo de dado usado.
        //O java nao pode garantir que voce adicione algo inconsistente na lista que usa wildCard com Generics

    }

    //List< ? extends Vehicle> vehicleList. Pode ser uma lista de qualquer coisa que extenda de Vehicle ou o
    //de Vehicle
    private static void driveVehicles( List< ? extends Vehicle> vehicleList){

        for (Vehicle v: vehicleList){
            v.drive();
        }
    }
}
