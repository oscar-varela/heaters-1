public class Heater
{ private double temperature;
  private double min;
  private double max;
  private double increment;
  
  public Heater()
  {
      temperature = 15.0;
      increment = 5.0;
  }
  
  public Heater(double minValue,double maxVaule)
  {  
      temperature = 15.0;
  }
  public double getTemperature()
  {
    return temperature;
  }
  public void warmer()
  {
    temperature += increment;
  }
  public void cooler()
  {
      temperature -= increment;
  }
}