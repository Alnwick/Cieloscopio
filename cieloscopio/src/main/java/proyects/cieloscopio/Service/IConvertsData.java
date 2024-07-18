package proyects.cieloscopio.Service;

public interface IConvertsData {
    <T> T getData(String json, Class<T> clazz);
}
