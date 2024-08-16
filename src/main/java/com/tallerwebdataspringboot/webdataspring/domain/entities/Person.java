package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
@Id
@Column(name = "id_person",columnDefinition = "VARCHAR(20)",nullable = false)
private String idPerson;
@Column(name = "first_name",columnDefinition = "VARCHAR(20)",nullable = false)
private String firstname;
@Column(name = "last_name",columnDefinition = "VARCHAR(20)",nullable = false)
private String lastname;


@ManyToOne
City city;


@ManyToOne
Type typePersons;

public Person() {
}

public String getIdPerson() {
    return idPerson;
}

public void setIdPerson(String idPerson) {
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

public City getCity() {
    return city;
}

public void setCity(City city) {
    this.city = city;
}



}
