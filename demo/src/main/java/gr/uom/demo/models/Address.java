package gr.uom.demo.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    private  int streetNumber;
    private String country;
    @OneToOne(mappedBy = "address_id")
    @JsonIgnore
    private Student student;

//Το κενό constructor το χρειάζεται
//το spring boot επειδή θέτουμε το id  entity
    public Address() {

    }

    public Address(String streetName, String country) {
        this.country = country;
        this.streetName=streetName;
    }

    public int getStreetNumber() {return streetNumber;}

    public void setStreetNumber(int streetNumber) {this.streetNumber = streetNumber;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    public String getStreetName() {return streetName;}

    public void setStreetName(String streetName) {this.streetName = streetName;}

    public Student getStudent() {return student;}

    public void setStudent(Student student) {this.student = student;}
}
