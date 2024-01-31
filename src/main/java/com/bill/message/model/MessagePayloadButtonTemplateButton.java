package com.bill.message.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessagePayloadButtonTemplateButton
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")


public class MessagePayloadButtonTemplateButton   {
  @JsonProperty("url")
  private Object url = null;

  @JsonProperty("title")
  private Object title = null;

  public MessagePayloadButtonTemplateButton url(Object url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @Schema(example = "https://www.google.com", description = "")
  
    public Object getUrl() {
    return url;
  }

  public void setUrl(Object url) {
    this.url = url;
  }

  public MessagePayloadButtonTemplateButton title(Object title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(example = "Visit Messenger", description = "")
  
    public Object getTitle() {
    return title;
  }

  public void setTitle(Object title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePayloadButtonTemplateButton messagePayloadButtonTemplateButton = (MessagePayloadButtonTemplateButton) o;
    return Objects.equals(this.url, messagePayloadButtonTemplateButton.url) &&
        Objects.equals(this.title, messagePayloadButtonTemplateButton.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePayloadButtonTemplateButton {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
