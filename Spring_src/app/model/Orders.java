package tk.jewsbar.jwtauth.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long orders_id;

    @Basic
    private Timestamp date;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recip_recip_id", nullable = false)

    private Recip recip;


    public Long getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Long orders_id) {
        this.orders_id = orders_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }


    public Recip getRecip() {
        return recip;
    }

    public void setRecip(Recip recip) {
        this.recip = recip;
    }
}