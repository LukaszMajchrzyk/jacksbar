package tk.jewsbar.jwtauth.app.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import tk.jewsbar.jwtauth.app.model.StoreItem;

import java.util.List;

@EnableAutoConfiguration
@Service
public interface StoreItemService {

    List<StoreItem> findAll();

    StoreItem create(StoreItem storeItem);

}
