package edu.jalc.bicycle;

import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;
import java.util.Random;

public class Bicycle implements Rideable, Pedalable, Brakeable, Trickable, Turnable{

   private double speed;
   private Direction direction;
   private double cost;
   private Wheel wheel;
   private BikeFrame frame;
   private String brand;
   private GearSet frontGears;
   private GearSet backGears;
   private String[] tricks = {"backflip","wheelie","360"};

   public Bicycle(double cost, String brand, Wheel wheel,
         BikeFrame frame, GearSet frontGears, GearSet backGears){
      this.cost = cost;
      this.wheel = wheel;
      this.frame = frame;
      this.brand = brand;
      this.frontGears = frontGears;
      this.backGears = backGears;
      this.speed = 0;
      this.direction = new Direction(0);
   }
   
   public void ride(){System.out.println("Time for a bike ride!");}
   public void pedal(){System.out.println("You are going " + ++speed + " mph");}
   public void brake(){System.out.println("You are going " + --speed + " mph");}
   public void doTrick(){
     System.out.println("Nice! you did a " + tricks[new Random().nextInt(tricks.length)]);
   }
   public void turn(double amount){
     this.direction.change(amount);
     System.out.println("Your current direction is " + direction);
   }

   public double getSpeed(){
     return this.speed;
   }
   
   public double getCost(){
     return cost;
   }

    public Wheel getWheel(){
      return wheel;
   }

    public BikeFrame getFrame(){
      return frame;
   }

    public String getBrand(){
      return brand;
   }

    public GearSet getFrontGears(){
      return frontGears;
   }

    public GearSet getBackGears(){
      return backGears;
   }

   public void setCost(double cost){
      this.cost = cost;
   }

   public void setWheel(Wheel wheel){
      this.wheel = wheel;
   }

   public void setFrame(BikeFrame frame){
      this.frame = frame;
   }

   public void setBrand(String brand){
      this.brand = brand;
   }

   public void setFrontGears(GearSet gears){
      frontGears = gears;
   }

   public void setBackGears(GearSet gears){
      backGears = gears;
   }
   
   public String toString(){
     return String.format("cost: $%.2f%nbrand: %s%nwheel: %s %.0f inch%n",
         getCost(), getBrand(), getWheel().getBrand(), getWheel().getDiameter());
   }
}
