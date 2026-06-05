package com.matheus.departuretimes.dto.api;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class DepartureDto {
    @Getter
    @Setter
    private String stopName;
    private List<DeparturePredictionDto> departures;

}