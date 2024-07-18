package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record MainData(
        @JsonAlias("temp") double currectTemp,
        @JsonAlias("temp_max") double maxTemp,
        @JsonAlias("temp_min") double minTemp
) {
}
