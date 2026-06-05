package com.matheus.departuretimes.dto.tfl;

import lombok.Getter;
import lombok.Setter;

public class TflStopPointDto {
    @Getter
    @Setter
    private String naptanId;
    @Getter
    @Setter
    private String commonName;
    @Getter
    @Setter
    private double distance;
}
