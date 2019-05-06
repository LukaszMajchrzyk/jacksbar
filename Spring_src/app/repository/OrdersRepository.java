package tk.jewsbar.jwtauth.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.jewsbar.jwtauth.app.model.Orders;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    Optional<Orders> findByDate(String date );

    Orders save (Orders orders);

}

