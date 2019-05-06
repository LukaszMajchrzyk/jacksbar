package tk.jewsbar.jwtauth.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tk.jewsbar.jwtauth.app.model.*;
import tk.jewsbar.jwtauth.app.service.EmployeeService;
import tk.jewsbar.jwtauth.app.service.StoreItemService;
import tk.jewsbar.jwtauth.app.service.StoreService;
import tk.jewsbar.jwtauth.app.service.OrdersService;
import tk.jewsbar.jwtauth.app.service.RecipService;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class RestApiController {

    @Autowired
    StoreService storeService;
    @Autowired
    StoreItemService storeItemService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    OrdersService ordersService;
    @Autowired
    RecipService recipService;


    @RequestMapping(value = "/api/test/store", method = RequestMethod.GET)
    public ResponseEntity<List<Store>> listAllStores() {
        List<Store> stores = storeService.findAll();
        if (stores.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Store>>(stores, HttpStatus.OK);
    }

    @PostMapping
    public Store create(@RequestBody Store store) {
        return storeService.create(store);
    }


    @RequestMapping(value = "/api/test/storeitem", method = RequestMethod.GET)

    public ResponseEntity<List<StoreItem>> listAllStoreItems() {
        List<StoreItem> storeItems = storeItemService.findAll();
        if (storeItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<StoreItem>>(storeItems, HttpStatus.OK);
    }


    @RequestMapping(value = "/api/test/employee", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> listAllEmployees() {
        List<Employee> employees = employeeService.findAll();
        if (employees.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }


    @RequestMapping(value = "/api/test/orders", method = RequestMethod.GET)
    public ResponseEntity<List<Orders>> listAllOrders() {
        List<Orders> orders = ordersService.findAll();
        if (orders.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
    }

//
//    @PostMapping
//    public Orders create(@RequestBody Orders orders) {
//        return ordersService.create(orders);
//    }
//
//


    @RequestMapping(value = "/api/test/recip", method = RequestMethod.GET)
    public ResponseEntity<List<Recip>> listAllRecip() {
        List<Recip> recips = recipService.findAll();
        if (recips.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Recip>>(recips, HttpStatus.OK);
    }
}



    


