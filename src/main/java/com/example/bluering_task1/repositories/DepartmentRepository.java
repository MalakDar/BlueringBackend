package com.example.bluering_task1.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bluering_task1.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
 Department findByDepartmentName(String name);
}
