package in.ac.jssateb.collegeservicemodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CollegeController {
    
    @Autowired
    private CollegeService service;
    
    // Retrieve All
    @GetMapping("/colleges")
    public ResponseEntity<List<College>> list() {
        try {
            List<College> colleges = service.listAll();
            return new ResponseEntity<>(colleges, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve by Id
    @GetMapping("/colleges/{id}")
    public ResponseEntity<College> get(@PathVariable Integer id) {
        try {
            College college = service.get(id);
            if (college != null) {
                return new ResponseEntity<>(college, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Create
    @PostMapping("/colleges")
    public ResponseEntity<College> save(@RequestBody College college) {
        try {
            College savedCollege = service.save(college);
            return new ResponseEntity<>(savedCollege, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update
    @PutMapping("/colleges/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody College college) {
        try {
            College existingCollege = service.get(id);
            if (existingCollege != null) {
                college.setId(id);
                service.save(college);
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete
    @DeleteMapping("/colleges/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        try {
            if (service.get(id) != null) {
                service.delete(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
