package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record WeatherAPIModel(
        @JsonAlias ("coord") CoordsModel coordinates,
        @JsonAlias ("weather") WeatherModel[] weatherMain,
        String base,
        @JsonAlias ("main") MainModel mainData,
        int visibility,
        WindModel wind,
        CloudsModel clouds,
        int dt,
        SysModel sys,
        int timezone,
        int id,
        @JsonAlias("name") String cityName,
        @JsonAlias("cod") int code
) {
}
