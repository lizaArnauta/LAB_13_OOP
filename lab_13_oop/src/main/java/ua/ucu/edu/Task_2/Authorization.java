package ua.ucu.edu.apps.second;

public class Autorization {
    public boolean to_autorizate(DataBase db) {
        db.getUserData();
        return true;
    }
}