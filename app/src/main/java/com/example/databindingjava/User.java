package com.example.databindingjava;

public class User {

    private String photo;
    private String name;
    private String surname;
    private Integer age;
    private String another;

    public User(String photoUrl, String name, String surname, Integer age, String another){
        this.photo=photoUrl;
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.another=another;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    @Override
    public String toString() {
        return "User{" +
                "photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", another='" + another + '\'' +
                '}';
    }
}
