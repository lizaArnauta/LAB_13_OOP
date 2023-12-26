package ua.ucu.edu.apps.second;

public class Main {
    public static void main(String[] args) {
        initializeDatabase();
    }

    private static void initializeDatabase() {
        DataBase db = createDatabase();

        Auth auth = new Auth();
        if (auth.authenticate(db)) {
            generateReport(db);
        }
    }

    private static DataBase createDatabase() {
        return new DataBase();
    }

    private static void generateReport(DataBase db) {
        ReportBuilder reportBuilder = new ReportBuilder(db);
}
