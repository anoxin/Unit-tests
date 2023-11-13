package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class VehicleTest {
  Car car;
  Motorcycle motorcycle;

  @BeforeEach
  void setUp() {
    car = new Car("Dodge", "Ran", 2010);
    motorcycle = new Motorcycle("Honda", "CB 100R", 2022);
  }

  @Test
  public void testCarIsInstanceOfVehicle() {
    assertTrue(car instanceof Vehicle);
  }

  @Test
  public void testNumberOfWheelsInTheCar() {
    assertThat(car.getNumWheels()).isEqualTo(4);
  }

  @Test
  public void testNumberOfWheelsInTheMotorcycle() {
    assertThat(motorcycle.getNumWheels()).isEqualTo(2);
  }

  @Test
  public void testSpeedCar() {
    car.testDrive();
    assertThat(car.getSpeed()).isEqualTo(60);
  }

  @Test
  public void testSpeedMotorcycle() {
    motorcycle.testDrive();
    assertThat(motorcycle.getSpeed()).isEqualTo(75);
  }

  @Test
  public void testStopCar() {
    car.testDrive();
    car.park();
    assertThat(car.getSpeed()).isEqualTo(0);
  }

  @Test
  public void testStopmotorcycle() {
    motorcycle.testDrive();
    motorcycle.park();
    assertThat(motorcycle.getSpeed()).isEqualTo(0);
  }

}