package tk.jewsbar.jwtauth.app.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import tk.jewsbar.jwtauth.app.model.Store;

import java.util.List;

@EnableAutoConfiguration
@Service
public interface StoreService {

    List<Store> findAll();

    Store create(Store store);

   // Store delete(int id);
    
    //Store findById(int id);

}
