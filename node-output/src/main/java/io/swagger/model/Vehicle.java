package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Vehicle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-15T21:05:41.677Z[GMT]")


public class Vehicle   {
  @JsonProperty("vehicleNumber")
  private String vehicleNumber = null;

  @JsonProperty("vehicleType")
  private String vehicleType = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("yearOfManufacture")
  private BigDecimal yearOfManufacture = null;

  public Vehicle vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  /**
   * Get vehicleNumber
   * @return vehicleNumber
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public Vehicle vehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Vehicle model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicle yearOfManufacture(BigDecimal yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
    return this;
  }

  /**
   * Get yearOfManufacture
   * @return yearOfManufacture
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(BigDecimal yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.vehicleNumber, vehicle.vehicleNumber) &&
        Objects.equals(this.vehicleType, vehicle.vehicleType) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.yearOfManufacture, vehicle.yearOfManufacture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleNumber, vehicleType, model, yearOfManufacture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    yearOfManufacture: ").append(toIndentedString(yearOfManufacture)).append("\n");
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
