package lk.codeschool.spring_codeschool.api;


import lk.codeschool.spring_codeschool.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @PostMapping(value = "/save")
    public void saveEmployee(@RequestBody EmployeeDTO obj) {  //save employee
        System.out.println("Employee saved"+obj);
    }


    @PostMapping(value = "/update")
    public void updateEmployee(@RequestBody EmployeeDTO obj) {  //update employee
        System.out.println("Employee updated" + obj);
    }


    @GetMapping(value = "/get/{id:EMP-[\\d]{3}$}")  //serch employee
    public EmployeeDTO search(String id) {
        return new EmployeeDTO(id,"Kamal",23,"kamal2@gmail.com");

    }


    @DeleteMapping(value = "/delete/{id:EMP-[\\d]{3}$}")  //delete emp

    public void deleteEmployee(@PathVariable String id) {
        System.out.println("Employee deleted"+id);

    }


}
