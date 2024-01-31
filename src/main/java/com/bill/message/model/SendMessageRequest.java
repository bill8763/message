package com.bill.message.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.bill.message.model.Message;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SendMessageRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class SendMessageRequest   {
  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("platform")
  private String platform = null;

  @JsonProperty("message")
  private Message message = null;

  public SendMessageRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * 要發送的使用者ID
   * @return userId
   **/
  @Schema(example = "100001", required = true, description = "要發送的使用者ID")
      @NotNull

    public Object getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SendMessageRequest platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public SendMessageRequest message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    @Valid
    public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageRequest sendMessageRequest = (SendMessageRequest) o;
    return Objects.equals(this.userId, sendMessageRequest.userId) &&
        Objects.equals(this.platform, sendMessageRequest.platform) &&
        Objects.equals(this.message, sendMessageRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, platform, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
