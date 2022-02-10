import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public abstract class TuoteFactory {
    public abstract Patonki luoPatonki();
    public abstract Jaatelo luoJaatelo();
}