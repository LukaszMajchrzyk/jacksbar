package tk.jewsbar.jwtauth.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.jewsbar.jwtauth.app.model.Recip;

import java.util.Optional;


@Repository
public interface RecipRepository extends JpaRepository<Recip, Long> {

    Optional <Recip> findByName(String name);
}
