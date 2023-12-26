package ua.ucu.edu.apps.first;

import java.time.LocalDateTime;

public class MyFacebookUser implements MyUser {
    private final FacebookUser facebookUser;

    private MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public static MyFacebookUser createFromFacebookUser(FacebookUser facebookUser) {
        return new MyFacebookUser(facebookUser);
    }

    @Override
    public String getEmail() {
        return obtainEmail();
    }

    @Override
    public String getCountry() {
        return fetchUserCountry();
    }

    @Override
    public LocalDateTime getLastActiveTime() {
        return retrieveLastActiveTime();
    }

    private String obtainEmail() {
        return facebookUser.getEmail();
    }

    private String fetchUserCountry() {
        return facebookUser.getUserCountry();
    }

    private LocalDateTime retrieveLastActiveTime() {
        return facebookUser.getUserActiveTime().atStartOfDay();
    }
}
