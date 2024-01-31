package com.bill.message.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.bill.message.portal.model.StatusInfo;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FetchHistoryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class FetchHistoryResponse   {
  @JsonProperty("response_status")
  private StatusInfo responseStatus = null;

  @JsonProperty("data")
  private Object data = null;

  public FetchHistoryResponse responseStatus(StatusInfo responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

  /**
   * Get responseStatus
   * @return responseStatus
   **/
  @Schema(description = "")
  
    @Valid
    public StatusInfo getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(StatusInfo responseStatus) {
    this.responseStatus = responseStatus;
  }

  public FetchHistoryResponse data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchHistoryResponse fetchHistoryResponse = (FetchHistoryResponse) o;
    return Objects.equals(this.responseStatus, fetchHistoryResponse.responseStatus) &&
        Objects.equals(this.data, fetchHistoryResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchHistoryResponse {\n");
    
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
