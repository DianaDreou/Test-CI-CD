package gr.uom.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
//    @SequenceGenerator(
//            name="st_seq",
//            sequenceName = "st_seq",
//            allocationSize = 1 //starts form 1 with 1 step
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//    generator = "st_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
    @JsonIgnore
    private List<Student> studentList = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Professor> professors = new ArrayList<>();

    public Course() {    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() { return id;    }

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name; }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public void addStudent(Student student){
        studentList.add(student);
        student.setCourse(this);
    }
}
