package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record SysModel(
        int type,
        int id,
        String country,
        int sunrise,
        int sunset
) {
}
