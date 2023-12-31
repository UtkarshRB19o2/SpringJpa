package rest;

import Entity.Employee;
import Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class ManagerController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<Long> create(@RequestBody Employee employee){
        return ResponseEntity.ok().body(employeeService.create(employee));
    }
}
