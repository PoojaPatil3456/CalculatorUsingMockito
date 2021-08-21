import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator calc = null;
    ArithmeticOperations service = mock(ArithmeticOperations.class);
    @BeforeEach
    void initiateObject(){
        calc = new Calculator(service);
    }

    @Test
    void toCalculateSumOfTwoDoubleValues(){
        when(service.sum(3.0,7.0)).thenReturn(10.0);
        assertEquals(10.0,calc.sum(3.0,7.0));
        verify(service).sum(3.0,7.0);
    }

    @Test
    void toCalculateDifferenceBetweenTwoDoubleValues(){
        when(service.difference(10.0,2.0)).thenReturn(5.0);
        assertEquals(5.0,calc.difference(10.0,2.0));
        verify(service).difference(10.0,2.0);
    }

    @Test
    void toCalculateProductOfTwoDoubleValues(){
        when(service.product(5.0,3.0)).thenReturn(15.0);
        assertEquals(15.0,calc.product(5.0,3.0));
        verify(service).product(5.0,3.0);
    }

    @Test
    void toCalculateQuotientWhenDividingTwoDoubleValues(){
        when(service.division(12.0,2.0)).thenReturn(6.0);
        assertEquals(6.0,calc.division(12.0,2.0));
        verify(service).division(12.0,2.0);
    }
}
