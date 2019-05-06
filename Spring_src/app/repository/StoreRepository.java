package tk.jewsbar.jwtauth.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tk.jewsbar.jwtauth.app.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    Optional<Store> findByName(String name);
   

    Store save(Store store);

    void delete(Store store);
    
       //Store findOne(int id);

}
