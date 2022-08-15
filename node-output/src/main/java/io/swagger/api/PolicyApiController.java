package io.swagger.api;

import io.swagger.model.Policy;
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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-15T21:05:41.677Z[GMT]")
@RestController
public class PolicyApiController implements PolicyApi {

    private static final Logger log = LoggerFactory.getLogger(PolicyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PolicyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Policy> drivers(@Parameter(in = ParameterIn.PATH, description = "pass an policy number to retreive the list of drivers mentioned on the policy", required=true, schema=@Schema()) @PathVariable("policyNumber") String policyNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Policy>(objectMapper.readValue("{\n  \"vehicles\" : [ {\n    \"yearOfManufacture\" : 0.8008281904610115,\n    \"vehicleNumber\" : \"vehicleNumber\",\n    \"model\" : \"model\",\n    \"vehicleType\" : \"vehicleType\"\n  }, {\n    \"yearOfManufacture\" : 0.8008281904610115,\n    \"vehicleNumber\" : \"vehicleNumber\",\n    \"model\" : \"model\",\n    \"vehicleType\" : \"vehicleType\"\n  } ],\n  \"drivers\" : [ {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"dlNumber\" : \"dlNumber\"\n  }, {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"dlNumber\" : \"dlNumber\"\n  } ]\n}", Policy.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Policy>(HttpStatus.NOT_IMPLEMENTED);
    }

}
