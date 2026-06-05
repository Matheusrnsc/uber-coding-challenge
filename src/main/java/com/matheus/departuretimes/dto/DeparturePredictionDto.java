package com.matheus.departuretimes.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

public class DeparturePredictionDto {
    @Getter
    @Setter
    private String line;
    @Getter
    @Setter
    private String destination;
    @Getter
    @Setter
    private int time;

}
