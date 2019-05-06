package tk.jewsbar.jwtauth.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "recip")
public class Recip {

    @Id
    @GeneratedValue
    private Long recip_id;

    @NotNull
    private double quantity;

    @NotNull
    private double price;

    private double quantity_item;

    private String name;



    @OneToMany(mappedBy = "recip", cascade = CascadeType.ALL)
    private Set<Orders> orders;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "storeitem_storeitem_id", nullable = false)
    private StoreItem storeItem;



    public Long getRecip_id() {
        return recip_id;
    }

    public void setRecip_id(Long recip_id) {
        this.recip_id = recip_id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity_item() {
        return quantity_item;
    }

    public void setQuantity_item(double quantity_item) {
        this.quantity_item = quantity_item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }


    public StoreItem getStoreItem() {
        return storeItem;
    }

    public void setStoreItem(StoreItem storeItem) {
        this.storeItem = storeItem;
    }
}