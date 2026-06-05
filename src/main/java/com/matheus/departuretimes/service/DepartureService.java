package com.matheus.departuretimes.service;

import org.springframework.stereotype.Service;

@Service
public class DepartureService {
    public String departure(double lat, double lon) {
        return "A latitude é: " + lat + "a longitude: " + lon;
    }
}
