package com.bill.message.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FetchTokenRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class FetchTokenRequest   {
  @JsonProperty("system_id")
  private Object systemId = null;

  @JsonProperty("valid_code")
  private Object validCode = null;

  public FetchTokenRequest systemId(Object systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * 來源系統ID
   * @return systemId
   **/
  @Schema(example = "A01", required = true, description = "來源系統ID")
      @NotNull

    public Object getSystemId() {
    return systemId;
  }

  public void setSystemId(Object systemId) {
    this.systemId = systemId;
  }

  public FetchTokenRequest validCode(Object validCode) {
    this.validCode = validCode;
    return this;
  }

  /**
   * 驗證碼
   * @return validCode
   **/
  @Schema(example = "ABC", required = true, description = "驗證碼")
      @NotNull

    public Object getValidCode() {
    return validCode;
  }

  public void setValidCode(Object validCode) {
    this.validCode = validCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchTokenRequest fetchTokenRequest = (FetchTokenRequest) o;
    return Objects.equals(this.systemId, fetchTokenRequest.systemId) &&
        Objects.equals(this.validCode, fetchTokenRequest.validCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemId, validCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchTokenRequest {\n");
    
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    validCode: ").append(toIndentedString(validCode)).append("\n");
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
