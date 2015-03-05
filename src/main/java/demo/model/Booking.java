package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jamesvrooney on 05/03/15.
 */
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;
    private String bookingName;

    public Booking(String bookingName) {
        super();
        this.bookingName = bookingName;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public String getBookingName() {
        return bookingName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", bookingName='" + bookingName + '\'' +
                '}';
    }
}
