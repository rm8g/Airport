package Airport;

public class Airplane {

  private String pilot;
  private String crew;
  private String type;
  private int airplane_id;
  private String[] seats;  
  
  public Airplane(String pilot, String crew, String type, int airplane_id, String[] seats) {
    super();
    this.pilot = pilot;
    this.crew = crew;
    this.type = type;
    this.airplane_id = airplane_id;
    this.seats = seats;
  }
  
  public String getPilot() {
    return pilot;
  }
  public void setPilot(String pilot) {
    this.pilot = pilot;
  }
  public String getCrew() {
    return crew;
  }
  public void setCrew(String crew) {
    this.crew = crew;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  
  
}
