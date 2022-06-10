package gr.uom.demo.services;

import gr.uom.demo.models.Course;
import gr.uom.demo.models.Student;
import gr.uom.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Student> getStudentsById(Long id){
      Course course = courseRepository.findById(id).orElseThrow( ()-> new IllegalStateException(
                "Course with isd: "+id+" doesn't exist"));
      return course.getStudentList();
    }
}
