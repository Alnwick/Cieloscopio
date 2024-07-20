package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record WeatherModel(
    @JsonAlias ("id") int typeWeather,
    @JsonAlias ("main") String mainWeather,
    @JsonAlias ("description") String descWeather,
    @JsonAlias ("icon") String extra
) {
}
