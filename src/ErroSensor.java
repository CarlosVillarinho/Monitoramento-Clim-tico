public class ErroSensor {
    //ATRIBUTOS
    private String idSensor, mensagemErro;

    //CONSTRUTOR
    public ErroSensor(String idSensor, String mensagemErro) {
        this.idSensor = idSensor;
        this.mensagemErro = mensagemErro;
    }

    //GET
    public String getIdSensor() {
        return idSensor;
    }
    public String getMensagemErro() {
        return mensagemErro;
    }
}
