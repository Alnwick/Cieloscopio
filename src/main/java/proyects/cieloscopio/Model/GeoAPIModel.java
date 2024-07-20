package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record GeoAPIModel(
        @JsonAlias("name") String cityName,
        @JsonAlias("local_names") LocalNamesModel localNamesModel,
        @JsonAlias("lat") double latitude,
        @JsonAlias("long") double length,
        @JsonAlias("country") String cityCountry
) {
}
