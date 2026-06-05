package com.matheus.departuretimes.controller;

import com.matheus.departuretimes.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departures")
public class DepartureController {

    private final DepartureService departureService;
    public DepartureController(DepartureService departureService) {
        this.departureService = departureService;
    }

    @GetMapping
    public String buscarDepartures( @RequestParam double lat,  @RequestParam double lon){
        return departureService.departure(lat,lon);
    };
}
