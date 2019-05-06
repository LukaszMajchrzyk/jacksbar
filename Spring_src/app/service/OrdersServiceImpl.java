package tk.jewsbar.jwtauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.jewsbar.jwtauth.app.model.Orders;
import tk.jewsbar.jwtauth.app.repository.OrdersRepository;

import java.util.List;

@Service("ordersService")
@Transactional

public class OrdersServiceImpl implements OrdersService {

        @Autowired
        private OrdersRepository ordersRepository;

        public List<Orders> findAll() {
            return ordersRepository.findAll();
        }


    public Orders create(Orders orders) {
        return ordersRepository.save(orders);
    }


    }



