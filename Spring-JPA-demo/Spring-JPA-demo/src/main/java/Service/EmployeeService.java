package Service;

import Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    public Long create(Employee employee){
        return employeeRepo.save(employee).getId();
    }
}
