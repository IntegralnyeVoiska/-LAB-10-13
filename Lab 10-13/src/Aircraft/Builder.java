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
public class Builder {
    public static Aircraft createCargo(String name, int capacityOfObject, int capacityOfPeople){
        return new Cargo(name,capacityOfObject,capacityOfPeople);
    }
    public static Aircraft createMilitary(String name, int capacityOfObject, int capacityOfPeople){
        return new Military(name,capacityOfObject,capacityOfPeople);
    }
    public static Aircraft createPassenger(String name, int capacityOfObject, int capacityOfPeople){
        return new Passenger(name,capacityOfObject,capacityOfPeople);
    }
}
