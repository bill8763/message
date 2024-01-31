package com.bill.message.portal.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bill.message.portal.api.AuthorizationApi;
import com.bill.message.portal.model.FetchTokenRequest;
import com.bill.message.portal.model.TokenResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")
@RestController
public class AuthorizationApiController implements AuthorizationApi {

	private static final Logger log = LoggerFactory.getLogger(AuthorizationApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AuthorizationApiController(ObjectMapper objectMapper, HttpServletRequest request) {

		this.objectMapper = objectMapper;
		this.request = request;

	}

	public ResponseEntity<TokenResponse> getAuthorization(
			@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody FetchTokenRequest body) {

		try {

			return new ResponseEntity<TokenResponse>(
					objectMapper.readValue("{\n  \"access_token\" : \"\"\n}", TokenResponse.class),
					HttpStatus.NOT_IMPLEMENTED);

		} catch (IOException e) {

			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<TokenResponse>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
}
