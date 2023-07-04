package bufferGenerics.RegrasAtribuicaoGenerics;

public abstract class Vehicle {

    public abstract void drive();

        static class Car extends Vehicle{
            @Override
            public void drive() {
                System.out.println("Driving Car!!");
            }
    }
        static class Bus extends Vehicle{
            @Override
            public void drive() {
                System.out.println("Driving Bus!!");
            }
        }


}
