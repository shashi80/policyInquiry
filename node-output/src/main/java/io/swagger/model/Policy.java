package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Drivers;
import io.swagger.model.Vehicles;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Policy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-15T21:05:41.677Z[GMT]")


public class Policy   {
  @JsonProperty("vehicles")
  private Vehicles vehicles = null;

  @JsonProperty("drivers")
  private Drivers drivers = null;

  public Policy vehicles(Vehicles vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
   **/
  @Schema(description = "")
  
    @Valid
    public Vehicles getVehicles() {
    return vehicles;
  }

  public void setVehicles(Vehicles vehicles) {
    this.vehicles = vehicles;
  }

  public Policy drivers(Drivers drivers) {
    this.drivers = drivers;
    return this;
  }

  /**
   * Get drivers
   * @return drivers
   **/
  @Schema(description = "")
  
    @Valid
    public Drivers getDrivers() {
    return drivers;
  }

  public void setDrivers(Drivers drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.vehicles, policy.vehicles) &&
        Objects.equals(this.drivers, policy.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicles, drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
