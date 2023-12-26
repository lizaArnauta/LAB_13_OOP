package ua.ucu.edu.apps.first;

import java.time.LocalDateTime;

public interface MyUser {
    String getEmail();
    String getCountry();
    LocalDateTime getLastActiveTime();
}