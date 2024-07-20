package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record MainModel(
        @JsonAlias ("temp") double temperature,
        @JsonAlias ("feels_like") double feelTemperature,
        @JsonAlias ("temp_min") double minTemperature,
        @JsonAlias ("temp_max") double maxTemperature,
        int pressure,
        int humidity,
        int sea_level,
        int grnd_level
) {
}
