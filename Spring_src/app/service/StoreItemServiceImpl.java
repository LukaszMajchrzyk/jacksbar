package tk.jewsbar.jwtauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.jewsbar.jwtauth.app.model.StoreItem;
import tk.jewsbar.jwtauth.app.repository.StoreItemRepository;

import java.util.List;

@Service("storeItemService")
@Transactional

public class StoreItemServiceImpl implements StoreItemService {

    @Autowired
    private StoreItemRepository storeItemRepository;

    public List<StoreItem> findAll() {
        return storeItemRepository.findAll();
    }
    
        //@Override
    public StoreItem create(StoreItem storeItem) {
        return storeItemRepository.save(storeItem);
    }

}
