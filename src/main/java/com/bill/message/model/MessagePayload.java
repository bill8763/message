package com.bill.message.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.bill.message.model.MessagePayloadButtonTemplate;
import com.bill.message.model.MessagePayloadImage;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessagePayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class MessagePayload   {
  @JsonProperty("text")
  private Object text = null;

  @JsonProperty("image")
  private MessagePayloadImage image = null;

  @JsonProperty("button_template")
  private MessagePayloadButtonTemplate buttonTemplate = null;

  public MessagePayload text(Object text) {
    this.text = text;
    return this;
  }

  /**
   * message_type為TEXT時使用
   * @return text
   **/
  @Schema(example = "Hello world", description = "message_type為TEXT時使用")
  
    public Object getText() {
    return text;
  }

  public void setText(Object text) {
    this.text = text;
  }

  public MessagePayload image(MessagePayloadImage image) {
    this.image = image;
    return this;
  }

  /**
   * message_type為IMAGE時使用
   * @return image
   **/
  @Schema(description = "message_type為IMAGE時使用")
  
    @Valid
    public MessagePayloadImage getImage() {
    return image;
  }

  public void setImage(MessagePayloadImage image) {
    this.image = image;
  }

  public MessagePayload buttonTemplate(MessagePayloadButtonTemplate buttonTemplate) {
    this.buttonTemplate = buttonTemplate;
    return this;
  }

  /**
   * message_type為BUTTON_TEMPLATE時使用
   * @return buttonTemplate
   **/
  @Schema(description = "message_type為BUTTON_TEMPLATE時使用")
  
    @Valid
    public MessagePayloadButtonTemplate getButtonTemplate() {
    return buttonTemplate;
  }

  public void setButtonTemplate(MessagePayloadButtonTemplate buttonTemplate) {
    this.buttonTemplate = buttonTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePayload messagePayload = (MessagePayload) o;
    return Objects.equals(this.text, messagePayload.text) &&
        Objects.equals(this.image, messagePayload.image) &&
        Objects.equals(this.buttonTemplate, messagePayload.buttonTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, image, buttonTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePayload {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    buttonTemplate: ").append(toIndentedString(buttonTemplate)).append("\n");
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
