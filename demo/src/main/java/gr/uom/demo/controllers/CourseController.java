package gr.uom.demo.controllers;

import gr.uom.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@Autowired
    private CourseService courseService;
}
