package model;

import model.enums.Gender;

import java.util.Arrays;

public class User {
    private String fullname;
    private String password;
    private String email;
    Gender gender;
    private long Userid;
    public Post[] posts = new Post[0];

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public long getUserid() {
        return Userid;
    }

    public void setUserid(long userid) {
        Userid = userid;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullname='" + fullname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", Userid=" + Userid +
                ", posts=" + Arrays.toString(posts) +
                '}';
    }
}
