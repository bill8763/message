package com.bill.message.portal.api.controller;

import com.bill.message.portal.api.ConversationApi;
import com.bill.message.portal.model.FetchHistoryResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-30T16:56:02.418270621Z[GMT]")
@RestController
public class ConversationApiController implements ConversationApi {

	private static final Logger log = LoggerFactory.getLogger(ConversationApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public ConversationApiController(ObjectMapper objectMapper, HttpServletRequest request) {

		this.objectMapper = objectMapper;
		this.request = request;

	}

	public ResponseEntity<FetchHistoryResponse> getConversationUserID(
			@Parameter(in = ParameterIn.HEADER, description = "JWT", required = true, schema = @Schema()) @RequestHeader(value = "Authorization", required = true) Object authorization,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("user_id") Object userId,
			@Parameter(in = ParameterIn.QUERY, description = "頁碼，預設1", schema = @Schema()) @Valid @RequestParam(value = "page", required = false) Object page,
			@Parameter(in = ParameterIn.QUERY, description = "篩選起始時間", schema = @Schema()) @Valid @RequestParam(value = "start_time", required = false) Object startTime,
			@Parameter(in = ParameterIn.QUERY, description = "篩選結束時間", schema = @Schema()) @Valid @RequestParam(value = "end_time", required = false) Object endTime) {

		try {

			return new ResponseEntity<FetchHistoryResponse>(objectMapper.readValue(
					"{\n  \"response_status\" : {\n    \"message\" : \"\",\n    \"status\" : \"\"\n  },\n  \"data\" : \"\"\n}",
					FetchHistoryResponse.class), HttpStatus.OK);

		} catch (IOException e) {

			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<FetchHistoryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
}
