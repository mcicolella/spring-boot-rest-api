/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.emmecilab.openapi.web;

import net.emmecilab.openapi.dto.Player;
import net.emmecilab.openapi.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-22T16:45:46.860748+02:00[Europe/Rome]")
@Validated
@Tag(name = "player", description = "the player API")
public interface PlayerApi {

    default PlayerApiDelegate getDelegate() {
        return new PlayerApiDelegate() {};
    }

    /**
     * DELETE /player/{id} : Delete a player by id
     *
     * @param id Id of the Player (required)
     * @return Delete player information successfully (status code 200)
     */
    @Operation(
        operationId = "deletePlayerById",
        summary = "Delete a player by id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Delete player information successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/player/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Response> deletePlayerById(
        @Parameter(name = "id", description = "Id of the Player", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().deletePlayerById(id);
    }


    /**
     * GET /player/{id} : Get a player by id
     *
     * @param id Id of the Player (required)
     * @return Get player information successfully (status code 200)
     */
    @Operation(
        operationId = "getPlayerById",
        summary = "Get a player by id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Get player information successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/player/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Player> getPlayerById(
        @Parameter(name = "id", description = "Id of the Player", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getPlayerById(id);
    }


    /**
     * GET /player : Get all players
     *
     * @return Get all players successfully (status code 200)
     */
    @Operation(
        operationId = "getPlayers",
        summary = "Get all players",
        responses = {
            @ApiResponse(responseCode = "200", description = "Get all players successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/player",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Player>> getPlayers(
        
    ) {
        return getDelegate().getPlayers();
    }

}
