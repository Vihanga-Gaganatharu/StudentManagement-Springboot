package lk.codeschool.spring_codeschool.api;


import lk.codeschool.spring_codeschool.dto.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentApi {
    @PostMapping("/save") // This is used to get the data from the URL (mapping ekata enna one path ekla meka)
    public String saveStudent(@RequestParam(value = "name" ,required = false) String name ,  //required = false is used to make the parameter optional
                              @RequestParam(value = "age") int age ,  // RequestParam is used to get the data from the URL
                              @RequestHeader("data")String data){ // RequestHeader is used to get the data from the header
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student data: "+data);

        return "Student saved";
    }

   @PostMapping(value = {"/{id:^STU-[0-9]{3}$}/{name}"}) // This is used to get the data from the URL (mapping ekata enna one path varibal ekak)
    public String pathVariable(@PathVariable String id,@PathVariable String name){ // PathVariable is used to get the data from the URL
       System.out.println(id);
       System.out.println(name);
        return "Path variable ok";
    }


    @PostMapping(value = "/json",consumes = "application/json") //consumes kiyanne balanne header wala contend type eke application jasonda kiyala
    public String json(@RequestBody Student student){
        System.out.println("Id: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        return "Json ok";
    }


    //arrya ekak hadala eken data yawanna

    @PostMapping(value = "/jsonList", consumes = "application/json")
    public String catchJsonArray(@RequestBody List<Student> List) {
        for (Student student : List) {
            System.out.println("----------------------------------------");
            System.out.println("Id: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());

            System.out.println("----------------------------------------");
        }
        return "Json list ok";
    }
}

