package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record CoordsModel(
        @JsonAlias("lon") double longitude,
        @JsonAlias("lat") double latitude
) {
}
