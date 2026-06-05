package com.matheus.departuretimes.dto.tfl;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class TflStopPointResponseDto {
    @Getter
    @Setter
    private List<TflStopPointDto> stopPoints;
    }


