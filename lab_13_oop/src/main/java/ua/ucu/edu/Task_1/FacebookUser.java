package ua.ucu.edu.apps.first;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data @ToString
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDate userActiveTime;
}