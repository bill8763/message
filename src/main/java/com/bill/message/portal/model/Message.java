package com.bill.message.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.bill.message.portal.model.MessagePayload;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class Message   {
  @JsonProperty("message_type")
  private String messageType = null;

  @JsonProperty("message_payload")
  private MessagePayload messagePayload = null;

  public Message messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * 傳送訊息類型
   * @return messageType
   **/
  @Schema(required = true, description = "傳送訊息類型")
      @NotNull

    public Object getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public Message messagePayload(MessagePayload messagePayload) {
    this.messagePayload = messagePayload;
    return this;
  }

  /**
   * Get messagePayload
   * @return messagePayload
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public MessagePayload getMessagePayload() {
    return messagePayload;
  }

  public void setMessagePayload(MessagePayload messagePayload) {
    this.messagePayload = messagePayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.messageType, message.messageType) &&
        Objects.equals(this.messagePayload, message.messagePayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, messagePayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    messagePayload: ").append(toIndentedString(messagePayload)).append("\n");
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
