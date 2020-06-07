package com.demo.spring.learningspring.business.service;

import com.demo.spring.learningspring.business.domain.RoomReservation;
import com.demo.spring.learningspring.data.entity.Reservation;
import com.demo.spring.learningspring.data.repository.GuestRepository;
import com.demo.spring.learningspring.data.repository.ReservationRepository;
import com.demo.spring.learningspring.data.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class ReservationService {
    //Need data from Tables, how to get data?
    //Using our interface with DB i.e Respositories
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    List<RoomReservation> getRoomReservationForDate(Date date){
        // Output list of reservations by Date
        List<RoomReservation> roomReservations = new ArrayList<>();
        // Get List of all the reservations for given date
        List<Reservation> reservations = this.reservationRepository.getReservationsByResDate(new java.sql.Date(date.getTime()));
        //We got all the ids of room, guest, reservation for given date
        for (Reservation reservation : reservations) {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setReservationId(reservation.getReservationId());
            roomReservation.setGuestId(reservation.getGuestId());
            roomReservation.setRoomId(reservation.getRoomId());
            roomReservation.setDate(date);
            roomReservations.add(roomReservation);
        }
        //populate remaining specific details such as roomNumber, roomName, firstName, firstName
        

        return roomReservations;
    }
}
