package lk.codeschool.spring_codeschool.api;


import lk.codeschool.spring_codeschool.dto.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.IOException;
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

    @PostMapping(value = "/formData", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFormData(@RequestPart(value = "test" , required = false) String id ,
                                 @RequestPart(value = "img")byte[] array,
                                 @RequestPart(value = "ext")String type) { // RequestPart is used to get the data from the form data   // Reqired false dammata passe eka awashyama naa defult enen true


        System.out.println("----------------------------------------");
        System.out.println("Student ID :"+id);
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("IMG Type :"+type);
        System.out.println("----------------------------------------");


//        System.out.println("----------------------------------------");
//        System.out.println();
//        String property = System.getProperty("user.home");
//        System.out.println("----------------------------------------");


        System.out.println("----------------------------------------");
        System.out.println(" byte Array length :"+array.length);
        System.out.println("----------------------------------------");




//        exportByteArraytoFile(array,"/uploards/test."+type);




        return "Form data handled";
    }


    public static void exportByteArraytoFile(byte[] byteArray, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

