package com.matheus.departuretimes.controller;

import com.matheus.departuretimes.dto.api.NearbyDeparturesDto;
import com.matheus.departuretimes.service.DepartureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departures/nearby")
public class DepartureController {

    private final DepartureService departureService;
    public DepartureController(DepartureService departureService) {
        this.departureService = departureService;
    }

    @GetMapping
    public String buscarDepartures( @RequestParam double lat,  @RequestParam double lon){
        return departureService.departure(lat,lon);
    };

    @GetMapping
    public List<NearbyDeparturesDto> buscarNearbyDepartures(@RequestParam double lat, @RequestParam double lon, @RequestParam String transporType){
        return buscarNearbyDepartures(lat,lon,transporType);
    }
}
