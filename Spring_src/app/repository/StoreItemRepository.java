package tk.jewsbar.jwtauth.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tk.jewsbar.jwtauth.app.model.StoreItem;

@Repository
public interface StoreItemRepository extends JpaRepository<StoreItem, Long> {

    Optional <StoreItem> findByName(String name);



}
