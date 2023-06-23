package dto;

import java.math.BigDecimal;

public class Person {
    private int idPerson;
    private String firstname;
    private String lastname;
    private int height;
    private BigDecimal weight;
     private int age;

        public Person(int idPerson, String firstname, String lastname, int height, BigDecimal weight, int age) {
            this.idPerson = idPerson;
            this.firstname = firstname;
            this.lastname = lastname;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
