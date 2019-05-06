package tk.jewsbar.jwtauth.app.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import tk.jewsbar.jwtauth.app.model.Orders;

import java.util.List;

@EnableAutoConfiguration
@Service
public interface OrdersService {

    List<Orders> findAll();

    Orders create (Orders orders);

}
