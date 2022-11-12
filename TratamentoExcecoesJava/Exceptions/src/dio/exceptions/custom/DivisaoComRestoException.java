package dio.exceptions.custom;

public class DivisaoComRestoException extends Exception{

    private int dividendo;
    private int divisor;

    public DivisaoComRestoException(String message, int dividendo, int divisor){
        super(message);
        this.dividendo  = dividendo;
        this.divisor = divisor;
    }
}
