package com.bill.message.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.bill.message.api.MessageApi;
import com.bill.message.message.MessageService;
import com.bill.message.model.SendMessageRequest;
import com.bill.message.model.StatusInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")
@RestController
public class MessageApiController implements MessageApi {

	private static final Logger log = LoggerFactory.getLogger(MessageApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final MessageService messageService;

	@org.springframework.beans.factory.annotation.Autowired
	public MessageApiController(ObjectMapper objectMapper, HttpServletRequest request, MessageService messageService) {

		this.objectMapper = objectMapper;
		this.request = request;
		this.messageService = messageService;

	}

	public ResponseEntity<StatusInfo> postMessageSend(
			@Parameter(in = ParameterIn.HEADER, description = "JWT", required = true, schema = @Schema()) @RequestHeader(value = "Authorization", required = true) String authorization,
			@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody SendMessageRequest body) {

		try {

			return messageService.sendMessage(authorization, body);
//				return new ResponseEntity<StatusInfo>(
//						objectMapper.readValue("{\n  \"message\" : \"\",\n  \"status\" : \"\"\n}", StatusInfo.class),
//						HttpStatus.NOT_IMPLEMENTED);

		} catch (IOException e) {

			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<StatusInfo>(HttpStatus.INTERNAL_SERVER_ERROR);

		} catch (Exception e) {

			return new ResponseEntity<StatusInfo>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
}
