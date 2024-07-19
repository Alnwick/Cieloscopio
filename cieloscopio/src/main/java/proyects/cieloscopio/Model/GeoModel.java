package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties (ignoreUnknown = true)
public record GeoModel(
        @JsonAlias("name") String nombre,
        @JsonAlias("local_names") Map<String, String> localNames,
        @JsonAlias("lat") double latitude,
        @JsonAlias("long") double length,
        @JsonAlias("country") String country,
        @JsonAlias("state") String state
) {
}
