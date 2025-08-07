import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {
    //ATRIBUTOS
    private List<Sensor> sensoresValidos;
    private List<ErroSensor> sensoresComErro;

    //CONSTRUTOR
    public SistemaMonitoramento() {
        this.sensoresValidos = new ArrayList<>();
        this.sensoresComErro = new ArrayList<>();
    }

    //METODOS
    public void exibirRelatorio(){

    }

    public void processarSensores(List<Sensor> sensores, List<List<Double>> dados){

    }
}
