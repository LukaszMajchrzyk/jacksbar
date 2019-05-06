package tk.jewsbar.jwtauth.app.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import tk.jewsbar.jwtauth.app.model.Recip;

import java.util.List;

@EnableAutoConfiguration
@Service
public interface RecipService {

    List<Recip> findAll();

    //Recip create(Recip recip);


}
