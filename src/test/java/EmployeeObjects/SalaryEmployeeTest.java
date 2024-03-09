package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
    @Test
    void calculateWeeklyPayTest() {
double pay = emp.calculateWeeklyPay();
System.out.println(pay);
assertEquals(1237.02,pay);
    }

    @Test
    void holidayBonusTest() {
       double bonus = emp.holidayBonus();
       System.out.println(bonus);
       assertEquals(2164.54,bonus);
    }
}