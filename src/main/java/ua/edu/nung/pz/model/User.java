package ua.edu.nung.pz.model;

import java.util.Objects;

public class User {
    public static final String USER_SESSION_NAME = "user";
    private long id;
    private String email;
    private String password;
    private String displayName;
    private String option;
    private String created_at;
    private String deleted_at;


    public User() {
    }

    public User(String email, String password, String displayName, String phone, String city) {
        this.email = email;
        this.password = password;
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", displayName='" + displayName + '\'' +
                ", option='" + option + '\'' +
                ", created_at='" + created_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(displayName, user.displayName) && Objects.equals(option, user.option) && Objects.equals(created_at, user.created_at) && Objects.equals(deleted_at, user.deleted_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, displayName, option, created_at, deleted_at);
    }
}
