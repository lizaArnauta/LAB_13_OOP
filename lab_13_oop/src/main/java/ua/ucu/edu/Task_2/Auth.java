package ua.ucu.edu.apps.second;

public class Auth extends Авторизація {
    public boolean auth(DataBase db) {
        db.recieveStaticData();
        return true;
    }
}