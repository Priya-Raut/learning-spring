package com.demo.spring.learningspring.web;

import com.demo.spring.learningspring.business.service.ReservationService;
import com.demo.spring.learningspring.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("guests")
public class GuestController {
    private final ReservationService reservationService;

    @Autowired
    public GuestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getAllGuests(Model model){
        List<Guest> guests = this.reservationService.getAllGests();
        model.addAttribute("guests", guests);
        return "guests"; //name of the template file
    }

}
