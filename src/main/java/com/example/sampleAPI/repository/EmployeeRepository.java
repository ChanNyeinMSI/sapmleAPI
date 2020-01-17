package com.example.sampleAPI.repository;

import com.example.sampleAPI.model.Employee;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
      extends JpaRepository<Employee, UUID>  {

}
