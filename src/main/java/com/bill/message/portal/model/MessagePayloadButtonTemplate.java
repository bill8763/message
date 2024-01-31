package com.bill.message.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessagePayloadButtonTemplate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class MessagePayloadButtonTemplate   {
  @JsonProperty("text")
  private Object text = null;

  @JsonProperty("buttons")
  private Object buttons = null;

  public MessagePayloadButtonTemplate text(Object text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
  @Schema(example = "What do you want to do next?", description = "")
  
    public Object getText() {
    return text;
  }

  public void setText(Object text) {
    this.text = text;
  }

  public MessagePayloadButtonTemplate buttons(Object buttons) {
    this.buttons = buttons;
    return this;
  }

  /**
   * Get buttons
   * @return buttons
   **/
  @Schema(description = "")
  
    public Object getButtons() {
    return buttons;
  }

  public void setButtons(Object buttons) {
    this.buttons = buttons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePayloadButtonTemplate messagePayloadButtonTemplate = (MessagePayloadButtonTemplate) o;
    return Objects.equals(this.text, messagePayloadButtonTemplate.text) &&
        Objects.equals(this.buttons, messagePayloadButtonTemplate.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePayloadButtonTemplate {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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
