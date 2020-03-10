

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ChambersMichaelTestTask1 {
    public Period a, b, periodStay;
    public ArrayList<Period> normalPeriod;
    public ArrayList<Period> reducedPeriod;
    public CarParkKind kind;
    public BigDecimal normal, reduced;
    public Rate test;

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateLessThan0() throws Exception{
        a = new Period(7, 17);
        b = new Period(18, 6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind = CarParkKind.STAFF;
        normal = new BigDecimal(-5);
        reduced = new BigDecimal(5);
        test = new Rate(kind, normal, reduced, reducedPeriod, normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedRateGreaterThanNormalRate() throws Exception{
        a = new Period(7, 17);
        b = new Period(18, 6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STAFF;
        normal = new BigDecimal(1);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateEqualTo0() throws Exception{
        a = new Period(7,17);
        b = new Period(18,6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STAFF;
        normal = new BigDecimal(0);
        reduced = new BigDecimal(1);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedRateLessThan0() throws Exception{
        a = new Period(7,17);
        b = new Period(18,6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STAFF;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(-5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedRateEqualTo0() throws Exception{
        a = new Period(7,17);
        b = new Period(18,6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STAFF;
        normal = new BigDecimal(1);
        reduced = new BigDecimal(0);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalPeriodEqualToNULL() throws Exception{
        a = null;
        b = new Period(18,6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STUDENT;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedPeriodEqualToNULL() throws Exception{
        a = new Period(7,17);
        b = null;
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STUDENT;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedRateEqualToNULL() throws Exception{
        a = new Period(7,17);
        b = null;
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STUDENT;
        normal = new BigDecimal(5);
        reduced = null;
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateEqualToNULL() throws Exception{
        a = new Period(7,17);
        b = null;
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STUDENT;
        normal = null;
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedPeriodOverlapNormalPeriod() throws Exception{
        a = new Period(7,10);
        b = new Period(8,12);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.VISITOR;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalPeriodOverlapReducedPeriod() throws Exception{
        a = new Period(7,12);
        b = new Period(10,15);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.VISITOR;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test
    public void CalculatePeriodWithinReducedPeriod() {
         a = new Period(7, 17);
         b = new Period(18, 23);
         periodStay = new Period(18, 22);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normal = new BigDecimal(7);
        BigDecimal reduced = new BigDecimal(5);
        Rate test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
        BigDecimal outCome = new BigDecimal(25);
        assertEquals(outCome, test.calculate(periodStay));
    }

    @org.junit.Test
    public void CalculatePeriodWithinNormalPeriod() {
        a = new Period(7, 17);
        b = new Period(18, 23);
        periodStay = new Period(7, 10);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normal = new BigDecimal(7);
        BigDecimal reduced = new BigDecimal(5);
        Rate test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
        BigDecimal outCome = new BigDecimal(21);
        assertEquals(outCome, test.calculate(periodStay));
    }

    @org.junit.Test
    public void CalculatePeriodWithinFree() {
        a = new Period(7, 17);
        b = new Period(18, 23);
        periodStay = new Period(1, 6);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normal = new BigDecimal(7);
        BigDecimal reduced = new BigDecimal(5);
        Rate test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
        BigDecimal outCome = new BigDecimal(0);
        assertEquals(outCome, test.calculate(periodStay));
    }


    @org.junit.Test
    public void CalculateNormalOverLapReduced() {
        a = new Period(7, 17);
        b = new Period(18, 23);
        periodStay = new Period(16, 19);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normal = new BigDecimal(7);
        BigDecimal reduced = new BigDecimal(5);
        Rate test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
        BigDecimal outCome = new BigDecimal(24);
        assertEquals(outCome, test.calculate(periodStay));
    }


}
