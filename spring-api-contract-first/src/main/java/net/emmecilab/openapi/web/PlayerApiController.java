package net.emmecilab.openapi.web;

import net.emmecilab.openapi.dto.Player;
import net.emmecilab.openapi.dto.Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-22T16:45:46.860748+02:00[Europe/Rome]")
@Controller
@RequestMapping("${openapi.playersManagementSystem.base-path:}")
public class PlayerApiController implements PlayerApi {

    private final PlayerApiDelegate delegate;

    public PlayerApiController(@Autowired(required = false) PlayerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PlayerApiDelegate() {});
    }

    @Override
    public PlayerApiDelegate getDelegate() {
        return delegate;
    }

}
