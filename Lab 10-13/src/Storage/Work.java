/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import Aircraft.Aircraft;

/**
 *
 * @author User
 */
public class Work {

    private static final String ERROR_CAPACITY_OF_OBJECT = "Ошибка при вычислениях в getAllCapacityOfObject: ";
    private static final String ERROR_CAPACITY_OF_PEOPLE = "Ошибка при вычислениях в getAllCapacityOfPeople: ";

    public int getAllCapacityOfObject(Storage storage) {
        try {
            int capacityOfObject = 0;

            for (Aircraft aircraft : storage.getAircrafts()) {
                capacityOfObject += aircraft.getCapacityOfObject();
            }

            return capacityOfObject;
        } catch (NullPointerException e) {
            throw new Error(ERROR_CAPACITY_OF_OBJECT + e);
        }
    }

    public int getAllCapacityOfPeople(Storage storage) {
        try {
            int capacityOfPeople = 0;

            for (Aircraft aircraft : storage.getAircrafts()) {
                capacityOfPeople += aircraft.getCapacityOfPeople();
            }

            return capacityOfPeople;
        } catch (NullPointerException e) {
            throw new Error(ERROR_CAPACITY_OF_PEOPLE + e);
        }
    }
}
