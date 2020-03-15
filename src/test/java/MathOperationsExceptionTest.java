import org.junit.*;
import static org.junit.Assert.*;

public class MathOperationsExceptionTest {

    @Before
    public void before() {
        System.out.println("Новый тест!");
    }

    @Test
    public void additionTest() {
        assertEquals(27, MathOperationsException.addition(24,3), 0);
        System.out.println("Сложение пройдено");
    }

    @Test
    public void substractionTest(){
        assertEquals(21, MathOperationsException.subtraction(24,3), 0);
        System.out.println("Вычитание пройдено");
    }

    @Ignore
    @Test
    public void multiplicationTest() {
        assertEquals(72, MathOperationsException.miltiplication(24,3), 0);
        System.out.println("Умножение пройдено");
    }

    @Test
    public void divisionTest() throws Exception{
        assertEquals(8, MathOperationsException.division(24,3), 0);
        System.out.println("Деление пройдено");
    }

    @Test
    public void sqrTest() {
        assertEquals(8, MathOperationsException.sqr(3), 1);
        System.out.println("Возведение в квадрат пройдено");
    }

    @Test
    public void sqrtTest() {
        assertEquals(5, MathOperationsException.sqrt(24), 0.12);
        System.out.println("Вычисление корня пройдено");
    }

    @After
    public void after() {
        System.out.println("Тест закончен.");
    }

}