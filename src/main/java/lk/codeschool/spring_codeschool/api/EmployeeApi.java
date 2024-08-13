package lk.codeschool.spring_codeschool.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    public void saveEmployee() {
        System.out.println("Employee saved");
    }

}
