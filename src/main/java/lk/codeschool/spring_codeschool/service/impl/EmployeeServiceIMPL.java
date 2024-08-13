// EmployeeServiceIMPL.java
package lk.codeschool.spring_codeschool.service.impl;

import lk.codeschool.spring_codeschool.dto.EmployeeDTO;
import lk.codeschool.spring_codeschool.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    ArrayList<EmployeeDTO> list = new ArrayList<>();

    @Override
    public void saveEmployee(EmployeeDTO obj) {
        for (EmployeeDTO employeeDTO : list) {
            if (employeeDTO.getId().equals(obj.getId())) {
                return;
            }
        }
        list.add(obj);
    }

    @Override
    public void updateEmployee(EmployeeDTO obj) {
        for (EmployeeDTO employeeDTO : list) {
            if (employeeDTO.getId().equals(obj.getId())) {
                employeeDTO.setName(obj.getName());
                employeeDTO.setAge(obj.getAge());
                employeeDTO.setEmail(obj.getEmail());
            }
        }
    }

    @Override
    public EmployeeDTO search(String id) {
        for (EmployeeDTO employeeDTO : list) {
            if (employeeDTO.getId().equals(id)) {
                return employeeDTO;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(String id) {
        for (EmployeeDTO employeeDTO : list) {
            if (employeeDTO.getId().equals(id)) {
                list.remove(employeeDTO);
            }
        }
    }

    public List<EmployeeDTO> getAllEmployees() {
        System.out.println("Employee List"+list);

        return list;


    }
}