package com.demo.spring.learningspring.web;

import com.demo.spring.learningspring.business.domain.RoomReservation;
import com.demo.spring.learningspring.business.service.ReservationService;
import com.demo.spring.learningspring.utils.DateUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationsController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationsController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(name="date", required=false)String dateString, Model model){
        //Convert the dateString we accepted in String form into Date form
        Date date = DateUtility.getDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        //controller puts data mapped to a key into the model
        model.addAttribute("roomReservations", roomReservations);
        //model populates the view with the data using the key it was mapped with
        return "reservations";
    }
}
