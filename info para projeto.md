
Endpoints:

1. GET https://api.tfl.gov.uk/StopPoint/Meta/StopTypes
[
"NaptanPublicBusCoachTram",
"NaptanMetroStation",
"NaptanRailStation"
]

2. GET https://api.tfl.gov.uk/StopPoint/?lat={lat}&lon={lon}&stopTypes={stopType}

{
"stopPoints": [
{
"naptanId": "490013767X",
"commonName": "Northumberland Avenue / Trafalgar Square",
"distance": 25.82
}
]

3. GET https://api.tfl.gov.uk/StopPoint/{naptanId}/ArrivalDepartures

   {
   "stationName": "Northumberland Avenue / Trafalgar Square",
   "lineName": "91",
   "destinationName": "Crouch End",
   "timeToStation": 966
   }