package proyects.cieloscopio.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GetAPI_KEY {

    @Value("${API_KEY}")
    private String API_KEY;

    public String getAPI_KEY() {
        return API_KEY;
    }
}
