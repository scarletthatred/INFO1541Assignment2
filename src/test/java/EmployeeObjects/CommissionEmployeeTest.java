package EmployeeObjects;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
    @ParameterizedTest
    @ValueSource(doubles = {35, 45})
    void testIncreaseSales(double s) {
        emp.increaseSales(s);
        if (s >= 0) {
            assertEquals(s, emp.getSales());
        }
        else{
            assertEquals(0, emp.getSales());
        }
    }

    @Test
    void annualRaise() {
        emp.annualRaise();
        emp.annualRaise();
        double rate = emp.getRate();
        System.out.println(rate);
        assertEquals(.0305,rate);
    }

    @Test
    void holidayBonus() {
        System.out.println(emp.holidayBonus());
        assertEquals(0,emp.holidayBonus());
    }
}
