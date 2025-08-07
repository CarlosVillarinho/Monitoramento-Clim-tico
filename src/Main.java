public class Main {
    public static void main(String[] args) {
        //ATRIBUTO
        int aux = 60;

        //TRY CATCH
        try{
            validar(aux);
        } catch (LeituraInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    //METODO
    private static void validar(int aux) throws LeituraInvalidaException {
        if (aux < -50 || aux > 50){
          throw new LeituraInvalidaException(10, aux);
        }
    }
}