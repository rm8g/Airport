package Airport;

import java.time.LocalDateTime;

public class Flight extends Airplane{

  private String flightnumber;
  private Airport destination;
  private LocalDateTime time_of_departure;
  private LocalDateTime time_of_arrival;
  private String gate;
  private String airline;
  private Airplane airplane;
  
  public String getFlightnumber() {
    return flightnumber;
  }
  public void setFlightnumber(String flightnumber) {
    this.flightnumber = flightnumber;
  }
  public Airport getDestination() {
    return destination;
  }
  public void setDestination(Airport destination) {
    this.destination = destination;
  }
  public LocalDateTime getTime_of_departure() {
    return time_of_departure;
  }
  public void setTime_of_departure(LocalDateTime time_of_departure) {
    this.time_of_departure = time_of_departure;
  }
  public LocalDateTime getTime_of_arrival() {
    return time_of_arrival;
  }
  public void setTime_of_arrival(LocalDateTime time_of_arrival) {
    this.time_of_arrival = time_of_arrival;
  }
  public String getGate() {
    return gate;
  }
  public void setGate(String gate) {
    this.gate = gate;
  }
  public String getAirline() {
    return airline;
  }
  public void setAirline(String airline) {
    this.airline = airline;
  }
  public Airplane getAirplane() {
    return airplane;
  }
  public void setAirplane(Airplane airplane) {
    this.airplane = airplane;
  }
  
  
  
}
