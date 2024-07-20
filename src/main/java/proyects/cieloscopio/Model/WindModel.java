package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record WindModel(
        @JsonAlias ("speed") double windSpeed,
        @JsonAlias ("deg") int windDeg,
        @JsonAlias ("gust") double windGust
) {
}
