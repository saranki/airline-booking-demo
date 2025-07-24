package com.airlines.booking;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private Map<Long, Booking> bookings = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    @GetMapping
    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }

    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id) {
        return bookings.get(id);
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        Long id = idCounter.incrementAndGet();
        booking.setId(id);
        bookings.put(id, booking);
        return booking;
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
        updatedBooking.setId(id);
        bookings.put(id, updatedBooking);
        return updatedBooking;
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookings.remove(id);
    }
}
