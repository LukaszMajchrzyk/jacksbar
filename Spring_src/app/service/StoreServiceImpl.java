package tk.jewsbar.jwtauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.jewsbar.jwtauth.app.model.Store;
import tk.jewsbar.jwtauth.app.repository.StoreRepository;

import java.util.List;

@Service("storeService")
@Transactional

public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Store create(Store store) {
        return storeRepository.save(store);
    }

}