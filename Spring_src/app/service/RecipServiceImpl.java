package tk.jewsbar.jwtauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.jewsbar.jwtauth.app.model.Recip;
import tk.jewsbar.jwtauth.app.repository.RecipRepository;

import java.util.List;

@Service("recipService")
@Transactional

public class RecipServiceImpl implements RecipService {

    @Autowired
    private RecipRepository recipRepository;

    public List<Recip> findAll() {
        return recipRepository.findAll();
    }

}
