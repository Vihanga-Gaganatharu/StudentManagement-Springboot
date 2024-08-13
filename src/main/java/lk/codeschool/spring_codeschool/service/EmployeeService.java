package lk.codeschool.spring_codeschool.service;


import lk.codeschool.spring_codeschool.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public void saveEmployee(EmployeeDTO obj);
    public void updateEmployee(EmployeeDTO obj);
    public EmployeeDTO search(String id);
    public void deleteEmployee(String id);
    List<EmployeeDTO> getAllEmployees();
}
