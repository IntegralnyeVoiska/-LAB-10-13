/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import Aircraft.Aircraft;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Storage {

    private Aircraft[] aircrafts;
    private static final String ERROR_REMOVE = "Ошибка при удалении обьекта в remove: ";
    private static final String ERROR_CHANGE = "Ошибка при изменении обьекта в change : ";
    private static final String ERROR_CHANGE_NAME = "Ошибка при изменении обьекта changeName : ";
    private static final String ERROR_CHANGE_OBJECT = "Ошибка при изменении обьекта changeObject : ";
    private static final String ERROR_CHANGE_PEOPLE = "Ошибка при изменении обьекта changePeople : ";

    public Storage() {
        //aircrafts = new Aircraft[1];
    }

    public Storage(Storage storage) {
        aircrafts = Arrays.copyOf(storage.getAircrafts(), storage.getAircrafts().length);
    }

    public void add(Aircraft aircraft) {
        if (aircrafts == null) {
            aircrafts = new Aircraft[1];
            aircrafts[aircrafts.length - 1] = aircraft;
        } else {
            aircrafts = Arrays.copyOf(aircrafts, aircrafts.length + 1);
            aircrafts[aircrafts.length - 1] = aircraft;
        }
    }

    public void remove(int id) {
        try {
            Aircraft[] n = new Aircraft[aircrafts.length - 1];
            System.arraycopy(aircrafts, 0, n, 0, id);
            System.arraycopy(aircrafts, id + 1, n, id, aircrafts.length - id - 1);
            aircrafts = n;
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new Error(ERROR_REMOVE + e);
        }

    }

    public void change(int id, String name, int capacityOfObject, int capacityOfPeople) {
        try {
            aircrafts[id].setName(name);
            aircrafts[id].setCapacityOfObject(capacityOfObject);
            aircrafts[id].setCapacityOfPeople(capacityOfPeople);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new Error(ERROR_CHANGE + e);
        }
    }

    public void changeName(int id, String name) {
        try {
            aircrafts[id].setName(name);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new Error(ERROR_CHANGE_NAME + e);
        }
    }

    public void changeObject(int id, int capacityOfObject) {
        try {
            aircrafts[id].setCapacityOfObject(capacityOfObject);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new Error(ERROR_CHANGE_OBJECT + e);
        }
    }

    public void changePeople(int id, int capacityOfPeople) {
        try {
            aircrafts[id].setCapacityOfPeople(capacityOfPeople);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new Error(ERROR_CHANGE_PEOPLE + e);
        }
    }

    public Aircraft[] getAircrafts() {
        return aircrafts;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        for (Aircraft aircraft : aircrafts) {
            msg.append(aircraft);
        }
        return msg.toString();
    }

}
