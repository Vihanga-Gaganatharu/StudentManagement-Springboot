package lk.codeschool.spring_codeschool.api;


import lk.codeschool.spring_codeschool.dto.EmployeeDTO;
import lk.codeschool.spring_codeschool.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    private EmployeeService service;

    public EmployeeApi( EmployeeService employeeService) {
        this.service = employeeService;
    }

    @PostMapping(value = "/save")
    public void saveEmployee(@RequestBody EmployeeDTO obj) {  //save employee
//        System.out.println("Employee saved"+obj);
        service.saveEmployee(obj);  // service eke saveEmployee method eka call karala thiyenne

    }


    @PostMapping(value = "/update")
    public void updateEmployee(@RequestBody EmployeeDTO obj) {  //update employee
//        System.out.println("Employee updated" + obj);
        service.updateEmployee(obj); // service eke updateEmployee method eka call karala thiyenne
    }


    @GetMapping(value = "/get/{id}")  //serch employee
    public EmployeeDTO search(String id) {
        return service.search(id); // service eke search method eka call karala thiyenne
    }


    @DeleteMapping(value = "/delete/{id:EMP-[\\d]{3}$}")  //delete emp

    public void deleteEmployee(@PathVariable String id) {

        service.deleteEmployee(id); // service eke deleteEmployee method eka call karala thiyenne
//        System.out.println("Employee deleted"+id);

    }


}
