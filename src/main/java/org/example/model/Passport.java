package org.example.model;

import jakarta.persistence.*;


@Entity
@Table(name = "passport")
public class Passport{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PassPerson owner;

    @Column(name = "number")
    private int passportNumber;

    public Passport() {
    }

    public Passport(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PassPerson getOwner() {
        return owner;
    }

    public void setOwner(PassPerson owner) {
        this.owner = owner;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "owner=" + owner +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
