import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    NextDayCalculator calculator=new NextDayCalculator();
    int result;
    @Test
    void testNextDayMonth3Day4(){
        result= calculator.nextDayOf(3,4,2023);
        assertEquals(5,result);
    }
    @Test
    void testNextDayMonth2Day7(){
        result= calculator.nextDayOf(2,7,2023);
        assertEquals(8,result);
    }
    @Test
    void TestNextDayMonth1Day31(){
        result=calculator.nextDayOf(1,31,2023);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth4Day30(){
        result=calculator.nextDayOf(4,30,2023);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth2Day28(){
        result=calculator.nextDayOf(2,28,2023);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth1Day29(){
        result=calculator.nextDayOf(1,29,2023);
        assertEquals(30,result);
    }
    @Test
    void TestNextDayMonth2Day29year2024(){
        result=calculator.nextDayOf(2,29,2024);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth2Day28year2024(){
        result=calculator.nextDayOf(2,28,2024);
        assertEquals(29,result);
    }
    @Test
    void TestNextDayMonth2Day28year2028(){
        result=calculator.nextDayOf(2,28,2024);
        assertEquals(29,result);
    }
    @Test
    void TestNextDayMonth2Day28year1700(){
        result=calculator.nextDayOf(2,28,1700);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth2Day28year1800(){
        result=calculator.nextDayOf(2,28,1800);
        assertEquals(1,result);
    }
    @Test
    void TestNextDayMonth2Day28year2000(){
        result=calculator.nextDayOf(2,28,2000);
        assertEquals(29,result);
    }
}