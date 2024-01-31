package com.bill.message.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JWTPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class JWTPayload   {
  @JsonProperty("system_id")
  private Object systemId = null;

  @JsonProperty("exp")
  private Object exp = null;

  public JWTPayload systemId(Object systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * Get systemId
   * @return systemId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Object getSystemId() {
    return systemId;
  }

  public void setSystemId(Object systemId) {
    this.systemId = systemId;
  }

  public JWTPayload exp(Object exp) {
    this.exp = exp;
    return this;
  }

  /**
   * 過期時間
   * @return exp
   **/
  @Schema(description = "過期時間")
  
    public Object getExp() {
    return exp;
  }

  public void setExp(Object exp) {
    this.exp = exp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTPayload jwTPayload = (JWTPayload) o;
    return Objects.equals(this.systemId, jwTPayload.systemId) &&
        Objects.equals(this.exp, jwTPayload.exp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemId, exp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTPayload {\n");
    
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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
