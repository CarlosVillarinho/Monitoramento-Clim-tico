import java.util.ArrayList;
import java.util.List;

public class Sensor {
    //ATRIBUTOS
    private List<Double> leituras; //SOMENTE INICIALIZACAO DA VARIAVEL, COMO BOA PRATICA
    private String id;

    //COSNTRUTOR
    public Sensor(String id) {
        this.id = id;
        this.leituras = new ArrayList<>(); //INICIALIZA O ARRAY NO CONSTRUTOR, COMO BOA PRATICA
    }

    //GET
    public List<Double> getLeitura() {
        return leituras;
    }
    public String getId() {
        return id;
    }

    //METODO
    public void registrarLeituras(List<Double> lista) throws LeituraInvalidaException { //"D" MAIUSCULO, SEMPRE QUE ESTEJA ENTRE "< >"
        if (lista.size() != 100){
            throw new IllegalArgumentException("O total de temperaturas deve ser igual a 100");
        }
        for (int i=0; i<lista.size(); i++){
            double temp = lista.get(i);
            if (temp < -60 || temp > 60){
                throw new LeituraInvalidaException(i, temp);
            }
        }
        this.leituras = lista;
    }

    //TooString
    @Override
    public String toString() {
        return "Sensor{" +
                "leituras=" + leituras +
                ", id='" + id + '\'' +
                '}';
    }
}