package com.Employee.service;

import com.Employee.modal.Employee;
import com.Employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class EmployeeService {
//    @Autowired
//     private  EmployeeRepo employeeRepo;
//    public Employee  create( Employee employee) {
// return employeeRepo.save(employee)
//
//    }
//
//    public List<Employee> getAllEmployee() {
//
//      return  employeeRepo.findAll();
//
//    }
//
//    public void delete() {
//   employeeRepo.deleteByID(id)
//
//    }
//}
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }

    public Employee update(Long id, Employee updatedEmployee) {
        return employeeRepo.findById(id).map(existingEmployee -> {
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setDeveloper(updatedEmployee.getDeveloper());

            existingEmployee.setDeveloper(updatedEmployee.getDeveloper());
            return employeeRepo.save(existingEmployee);
        }).orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }
}

