public class LeituraInvalidaException extends Exception {
    //CONSTRUTOR
    public LeituraInvalidaException(int posicao, double temperatura){
        super("Leitura invalida na posição "+ posicao + ": " + temperatura + "ºC");
    }
}