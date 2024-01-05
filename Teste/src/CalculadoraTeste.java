import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTeste {

	
    @Test
	public void SomaDoisNumeros() {
		Calculadora cal = new Calculadora();
		int soma = cal.soma(10, 20);
		Assertions.assertEquals(30, soma);
	}
   
    @Test
    public void Divisao() {
    	Calculadora cal = new Calculadora();
    	double div = cal.divisao(30, 10);
    	Assertions.assertEquals(3, div);
    }
    
    @Test
    public void Multiplicacao() {
    	Calculadora cal = new Calculadora();
    	int mul = cal.multiplicacao(30, 10);
    	Assertions.assertEquals(300, mul);
    }
    
    @Test
    public void Subtracao() {
    	Calculadora cal = new Calculadora();
    	int Sub = cal.subtracao(30, 10);
    	Assertions.assertEquals(20, Sub);
    }
}
