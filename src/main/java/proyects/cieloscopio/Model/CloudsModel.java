package proyects.cieloscopio.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record CloudsModel(
        int all
) {
}
