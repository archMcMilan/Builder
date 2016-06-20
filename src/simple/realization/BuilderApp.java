package simple.realization;

/**
 * Created by Artem on 20.06.16.
 * Simple builder pattern
 */
public class BuilderApp {
    public static void main(String[] args) {
        Car car=new CarBuilder()
                .buildMark("BMW")
                .buildTransmission(Transmission.MANUAL)
                .buildMaxSpeed(320)
                .build();

        System.out.println(car);
    }
}

enum Transmission{
    MANUAL,AUTO
}

class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "simple.realization.Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class CarBuilder{
    String m="Default";
    Transmission t=Transmission.MANUAL;
    int s=240 ;

    CarBuilder buildMark(String m){
        this.m=m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t){
        this.t=t;
        return this;
    }

    CarBuilder buildMaxSpeed(int s){
        this.s =s;
        return this;
    }

    Car build(){
        Car car=new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
