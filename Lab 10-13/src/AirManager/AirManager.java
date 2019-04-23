/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import Airline.Airline;
import Aircraft.Builder;
import Storage.Work;
import org.apache.log4j.*;

/**
 *
 * @author User
 */
public class AirManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(AirManager.class);
        BasicConfigurator.configure();

        Work work = new Work();
        Airline dimasPolitasters = new Airline("Dimas fly садись если хочещь отправиться в рай.");
        try {
            dimasPolitasters.getStorage().add(Builder.createCargo("Рыжий", 400, 2));
            dimasPolitasters.getStorage().add(Builder.createMilitary("Анархист", 200, 2));
            dimasPolitasters.getStorage().add(Builder.createPassenger("Ради Гари 4ый подход", 100, 200));
            dimasPolitasters.getStorage().changeName(0, "Не Рыжий");
            logger.info("\r\n\t\tОбщая вместисость человеческих попок : " + work.getAllCapacityOfPeople(dimasPolitasters.getStorage())
                    + "\r\n\t\tОбщая вместисость обьектов : " + work.getAllCapacityOfObject(dimasPolitasters.getStorage()));
            logger.info(dimasPolitasters);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

}
