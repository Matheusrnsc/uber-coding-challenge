package com.matheus.departuretimes.dto.api;

import lombok.Getter;
import lombok.Setter;

public class DeparturePredictionDto {
   @Setter
   @Getter
   private String stationName;

   @Setter
   @Getter

   private String lineName;

   @Getter
   @Setter
   private String destinationName;

   @Getter
   @Setter
   private int timeToStation;

}
