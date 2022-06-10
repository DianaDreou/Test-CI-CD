package gr.uom.demo;

import gr.uom.demo.models.Address;
import gr.uom.demo.models.Course;
import gr.uom.demo.models.Student;
import gr.uom.demo.repositories.AddressRepository;
import gr.uom.demo.repositories.CourseRepository;
import gr.uom.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository,
                                        CourseRepository courseRepository){
        return args -> {
            Course course = new Course("Java");
            Student student = new Student("Maria",
                    "Pa",
                    25,
                    "maria@gmail.com");
            student.setAddress(new Address("Gkratsiou", "Greece"));
            course.addStudent(student);

            Student student1 = new Student("Eleni",
                    "Pa",
                    22,
                    "eleni@gmail.com");
            student1.setAddress(new Address("Papavasileiou", "Greece"));
            course.addStudent(student1);
            courseRepository.save(course);
//            studentRepository.save(student);
//            studentRepository.save(student1);
        };
    }
}
