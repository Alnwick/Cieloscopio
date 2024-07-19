package proyects.cieloscopio.Service;

public interface IConvertData {
    <T> T getData(String json, Class<T> clase);
}
