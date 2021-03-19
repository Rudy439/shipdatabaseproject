package sk.kosickaakademia.logistic.database;

import sk.kosickaakademia.logistic.util.Time;

public class Database {
    Time time = new Time();
    private final String INSERTShip = "INSERT INTO ships (purpose, type, country, age, name) " +
            "VALUES ( ?, ?, ?, ?, ?) ";
}
