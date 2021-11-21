/**
 * Class Car contains make, model, year and cost, and getter methods.
 *
 * Youssef Kafel
 * 4/16/2021
 */
import java.util.*;
public class Car {
    private String make;
    private String model;
    private int year;
    private int cost;

    public Car(String m,String mo,int y, int c){
        make = m;
        model = mo;
        year = y;
        cost = c;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getCost() {
        return cost;
    }

    public String toString(){
        return "Make: " + make + " Model: " + model + " Year: " + year + " Cost: " + cost;
    }

    public boolean isAntique(){
        if(year<1970){
            return true;
        }
        return false;
    }
}
