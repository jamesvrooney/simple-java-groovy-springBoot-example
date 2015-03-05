package demo.service;

import demo.model.Booking;
import demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jamesvrooney on 05/03/15.
 */
@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public Collection<Booking> getAllBookings() {
        return this.bookingRepository.findAll();
    }
}
