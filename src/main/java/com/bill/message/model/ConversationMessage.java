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
 * ConversationMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class ConversationMessage   {
  @JsonProperty("timestamp")
  private Object timestamp = null;

  @JsonProperty("sender_id")
  private Object senderId = null;

  @JsonProperty("recipient_id")
  private Object recipientId = null;

  @JsonProperty("message")
  private Message message = null;

  public ConversationMessage timestamp(Object timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * 訊息時間，格式YYYY-MM-DDTHH:mm:ss:sssZ
   * @return timestamp
   **/
  @Schema(example = "2024-01-01T12:05:00Z", required = true, description = "訊息時間，格式YYYY-MM-DDTHH:mm:ss:sssZ")
      @NotNull

    public Object getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

  public ConversationMessage senderId(Object senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * 發送人ID
   * @return senderId
   **/
  @Schema(required = true, description = "發送人ID")
      @NotNull

    public Object getSenderId() {
    return senderId;
  }

  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

  public ConversationMessage recipientId(Object recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * 接收人ID
   * @return recipientId
   **/
  @Schema(required = true, description = "接收人ID")
      @NotNull

    public Object getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

  public ConversationMessage message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(required = true, description = "")
      @NotNull

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
    ConversationMessage conversationMessage = (ConversationMessage) o;
    return Objects.equals(this.timestamp, conversationMessage.timestamp) &&
        Objects.equals(this.senderId, conversationMessage.senderId) &&
        Objects.equals(this.recipientId, conversationMessage.recipientId) &&
        Objects.equals(this.message, conversationMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, senderId, recipientId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessage {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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
