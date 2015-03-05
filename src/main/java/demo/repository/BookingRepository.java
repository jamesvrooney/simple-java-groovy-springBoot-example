package demo.repository;

import demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by jamesvrooney on 05/03/15.
 */
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Collection<Booking> findByBookingName(String bookingName);
}
