package main.java.eu.senla.javaEE.hotel.model;

/**
 * Guest class....
 */
public class Guest {

    private String name;
    private String surname;
    private String phone;
    private Sex sex;
    private Integer age;
    private Option option;


    public Guest() {
    }

    public Guest(String name, String surname, String phone, Sex sex, Integer age) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", option=" + option +
                '}';
    }



}

