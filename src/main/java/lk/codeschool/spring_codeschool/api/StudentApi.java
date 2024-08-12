package lk.codeschool.spring_codeschool.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApi {
    @PostMapping("/save")
    public String saveStudent(@RequestParam(value = "name" ,required = false) String name ,  //required = false is used to make the parameter optional
                              @RequestParam(value = "age") int age ,  // RequestParam is used to get the data from the URL
                              @RequestHeader("data")String data){ // RequestHeader is used to get the data from the header
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student data: "+data);

        return "Student saved";
    }
}
