/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import Storage.Storage;

/**
 *
 * @author User
 */
public class Airline {

    private String name;
    private Storage storage;

    public Airline() {
        storage = new Storage();
    }

    public Airline(String name) {
        this.name = name;
        storage = new Storage();
    }

    public Storage getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return storage.toString().replaceAll("\n", "\n\t\t");
    }
    

}
