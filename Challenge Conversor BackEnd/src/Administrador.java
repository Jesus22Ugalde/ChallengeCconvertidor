import java.util.Map;

public interface Administrador {
    void setupValues();

    Double convert(String from, String to, int val);
}