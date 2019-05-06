package tk.jewsbar.jwtauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tk.jewsbar.jwtauth.app.repository.StoreRepository;
import tk.jewsbar.jwtauth.app.service.StoreService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {

    @Autowired
    StoreService storeService;

    StoreRepository storeRepository;

    @GetMapping("/api/test/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return ">>> test!";
    }

    @GetMapping("/api/test/pm")
    @PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
    public String projectManagementAccess() {
        return ">>> Project Management Board";
    }

    @GetMapping("/api/test/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return ">>> Admin Contents";
    }

    @GetMapping("/api/test/hello")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String helloWorld()
    {
    return ">>> hell no !";
}




}





