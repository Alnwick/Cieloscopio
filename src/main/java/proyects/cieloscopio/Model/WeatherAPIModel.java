package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record WeatherAPIModel(
        CoordsModel coords,
        WeatherModel[] weather,
        String base,
        MainModel main,
        int visibility,
        WindModel wind,
        CloudsModel clouds,
        int dt,
        SysModel sys,
        int timezone
) {
}
