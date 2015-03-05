package demo.controller;

import demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import demo.repository.BookingRepository;
import demo.model.Booking;

/**
 * Created by jamesvrooney on 05/03/15.
 */
@RestController
class BookingRestController {

    @Autowired
    BookingService bookingService;

    @RequestMapping("/rooney")
    Collection<Booking> bookings() {
        return this.bookingService.getAllBookings();
    }
}