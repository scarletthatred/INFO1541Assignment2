package EmployeeObjects;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    private double wage;
    private double hoursWorked;
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    @ParameterizedTest
    @ValueSource(doubles = {35, 3, -5, 199,0,10000000,0.0254545})
    public void increaseHoursTestForPositive(double h) {
      emp.increaseHours(h);
      hoursWorked = emp.getHoursWorked();
      System.out.println(hoursWorked);
      if(h>= 0) {
          assertEquals(h, hoursWorked);
      }
      else{
          assertEquals(0, hoursWorked);
      }
    }
@Test
    public void annualRaiseTest(){
        double wage1 = emp.getWage();
        emp.annualRaise();
        wage = emp.getWage();
        System.out.println("old wage:"+wage1+"-----------------------New Wage:"+wage);
        assertEquals( wage1+ (double) Math.round(wage1 * 5) /100,wage);
}
    @ParameterizedTest
    @ValueSource(doubles = {35,45})
public void calculateWeeklyPayTest(double h){
        emp.increaseHours(h);
        hoursWorked = emp.getHoursWorked();
        wage = emp.getWage();
        double v = emp.calculateWeeklyPay();
        System.out.println(v);
        if (hoursWorked >= 40){
            assertEquals((hoursWorked-40)*(wage*1.5)+(wage*40),v);
        }
        else{
            assertEquals(wage*hoursWorked,v);
        }

    }

}