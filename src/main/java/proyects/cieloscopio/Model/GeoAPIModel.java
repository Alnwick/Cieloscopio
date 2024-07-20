package proyects.cieloscopio.Model;

public record GeoAPIModel(
        String name,
        LocalNamesModel local_names,
        double lat,
        double lon,
        String country
) {
}
