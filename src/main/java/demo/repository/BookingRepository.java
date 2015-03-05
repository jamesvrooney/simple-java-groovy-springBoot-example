package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import demo.repository.BookingRepository;
import demo.model.Booking;

/**
 * Created by jamesvrooney on 05/03/15.
 */
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Collection<Booking> findByBookingName(String bookingName);
}
