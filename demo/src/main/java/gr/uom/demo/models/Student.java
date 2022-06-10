package gr.uom.demo.models;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lName;
    private int age;
    private String email;
    //It attaches the address id to the student
    //Cascade is always all
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "address_id",referencedColumnName = "id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "course_id" , referencedColumnName = "id")
    private Course course;

    public Student(){}

    public Student(String name, String lName, int age, String email) {
        this.name = name;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {return address;}

    public void setAddress(Address address) {this.address = address;}

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
