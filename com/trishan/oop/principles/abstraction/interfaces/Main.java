package com.trishan.oop.principles.abstraction.interfaces;

public class Main {
    // Interfaces -> contain abstract methods (can be referred as blueprint of class), used for Multiple Inheritance and Total Abstraction

    // by default, all methods are public and abstract
    // by default, variables are public, static and final
    // can't have constructors

    // methods must be implemented as we do in abstract classes
    // don't use it in performance critical code as it happens in runtime
    // we can extend interfaces as well
    // Nested interfaces can also be accessible via Class.InterfaceName

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.brake();
        c1.brake2();
        // c1.details();, Car.details(); // not possible
        Brake.details();
        c1.stop();

        NiceCar c2 = new NiceCar();
        c2.startEngine();
        c2.startMusic();

        c2.stopEngine();
        c2.stopMusic();
    }
}

class Car implements Engine, Brake, MediaPlayer {
    @Override
    public void brake() {
        System.out.println("Brake!!!!");
    }

    @Override
    public void start() {
        System.out.println("Starting car!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car!");
    }

    @Override
    public void brake2() {

    }
}

// Separate Classes in Same Interface
class NiceCar {
    private Engine engine;
    private MediaPlayer mediaPlayer = new MusicPlayer();;

    NiceCar(){
        this.engine = new CarEngine();
    }

    void startEngine(){
        engine.start();
    }

    void stopEngine(){
        engine.stop();
    }

    void startMusic(){
        mediaPlayer.start();
    }

    void stopMusic(){
        mediaPlayer.stop();
    }
}

class CarEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine started!");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped!");
    }
}

class MusicPlayer implements MediaPlayer {
    @Override
    public void start() {
        System.out.println("Media player started!");
    }

    @Override
    public void stop() {
        System.out.println("Media player stopped!");
    }
}