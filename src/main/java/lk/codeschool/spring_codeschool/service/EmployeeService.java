package lk.codeschool.spring_codeschool.service;


import lk.codeschool.spring_codeschool.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    void saveEmployee(EmployeeDTO obj);
    void updateEmployee(EmployeeDTO obj);
    EmployeeDTO search(String id);
    void deleteEmployee(String id);
}
