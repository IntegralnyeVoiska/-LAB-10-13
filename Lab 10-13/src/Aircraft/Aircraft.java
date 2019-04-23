/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aircraft;

/**
 *
 * @author User
 */
public class Aircraft {

    private String name;
    private int capacityOfObject;
    private int capacityOfPeople;

    public Aircraft(String name, int capacityOfObject, int capacityOfPeople) {
        this.name = name;
        this.capacityOfObject = capacityOfObject;
        this.capacityOfPeople = capacityOfPeople;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getCapacityOfObject() {
        return capacityOfObject;
    }

    public void setCapacityOfObject(int capacityOfObject) {
        this.capacityOfObject = capacityOfObject;
    }

    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    @Override
    public String toString() {
        return "\nName : " + name
                + "\nCapacity of object : " + capacityOfObject
                + "\nCapacity of people : " + capacityOfPeople + "\n";
    }

}
