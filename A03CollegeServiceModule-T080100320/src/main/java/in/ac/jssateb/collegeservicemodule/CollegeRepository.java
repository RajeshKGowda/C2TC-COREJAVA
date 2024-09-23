package in.ac.jssateb.collegeservicemodule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Integer> {
    // No additional methods needed for basic CRUD operations
}
