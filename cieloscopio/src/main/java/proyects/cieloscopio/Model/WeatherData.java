package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)

public record WeatherData(
        @JsonAlias("description") String climaticCondition
) {
}
