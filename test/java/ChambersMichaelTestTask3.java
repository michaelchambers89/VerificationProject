import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ChambersMichaelTestTask3 {
    public Period a, b, c, d, e, f, periodStay;
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
        reduced = null;
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedPeriodEqualToNULL() throws Exception{
        a = new Period(7,17);
        b = null;
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod = null;
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
        reducedPeriod = null;

        kind= CarParkKind.STUDENT;
        normal = null;
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateEqualNegative() throws Exception{
        a = new Period(7,17);
        b = new Period(18,6);
        normalPeriod = new ArrayList<Period>();
        reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STUDENT;
        normal = new BigDecimal(-5);
        reduced = new BigDecimal(-5);
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
    public void CalculatePeriodWithinReducedPeriod()
    {
        a = new Period(7,17);
        b = new Period(18,23);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(a);
        reducedPeriods.add(b);

        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(18,22);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("20.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CalculatePeriodWithinNormalPeriod()
    {
        a = new Period(7,17);
        b = new Period(18,23);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(a);
        reducedPeriods.add(b);

        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,10);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("21.00");

        assertEquals(result,outcome);
    }


    @org.junit.Test
    public void CalculatePeriodWithinFree()
    {
        a = new Period(7,17);
        b = new Period(18,23);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(a);
        reducedPeriods.add(b);

        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(1,6);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("3.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CalculateNormalOverLapReduced()
    {
        a = new Period(7,17);
        b = new Period(18,23);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(a);
        reducedPeriods.add(b);

        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(16,19);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("12.00");

        assertEquals(result,outcome);
    }

    // Task 2

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedRateLessThanZero() throws Exception {
        a  = new Period(0,7);
        b = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        kind= CarParkKind.STAFF ;
        normal = new BigDecimal(5);
        reduced = new BigDecimal(-5);
        test= new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ReducedPeriodAndNormalPeriodDontOverlap() throws Exception {
        a = new Period(7,9);
        b = new Period(7,13);
        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.STAFF;
        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);
        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ThreeReducedPeriodsAndThreeNormalPeriodsDontOverlap() throws Exception {

        a = new Period(7,9);
        b = new Period(8,13);
        c = new Period(14,19);

        d = new Period(19,21);
        e = new Period(21,22);
        f = new Period(22,23);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        normalPeriod.add(b);
        normalPeriod.add(c);

        reducedPeriod.add(d);
        reducedPeriod.add(e);
        reducedPeriod.add(f);

        CarParkKind kind= CarParkKind.STAFF;
        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void TwoPeriodsInReducedPeriod() throws Exception {

        a = new Period(7,9);
        b = new Period(9,13);

        c = new Period(19,21);
        d = new Period(20,22);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        normalPeriod.add(b);

        reducedPeriod.add(c);
        reducedPeriod.add(d);

        CarParkKind kind= CarParkKind.STAFF;
        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void PeriodsValidTogether() throws Exception {

        a = new Period(8,12);
        b = new Period(13,15);

        c = new Period(8,17);
        d = new Period(17,21);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(a);
        normalPeriod.add(b);

        reducedPeriod.add(c);
        reducedPeriod.add(d);
//dfgfddg
        CarParkKind kind= CarParkKind.STAFF;
        normal = new BigDecimal(7);
        reduced = new BigDecimal(5);

        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateLessThanZero() throws Exception {

        a = new Period(0,7);
        b = new Period(8,12);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.STAFF;
        normal = new BigDecimal(-5);
        reduced = new BigDecimal(5);

        test = new Rate(kind,normal,reduced,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void NormalRateEqualToNull() throws Exception {

        a = new Period(0,7);
        b = new Period(8,12);

        ArrayList<Period> normalPeriod = new ArrayList<Period>();
        ArrayList<Period> reducedPeriod = new ArrayList<Period>();

        normalPeriod.add(a);
        reducedPeriod.add(b);

        CarParkKind kind= CarParkKind.STAFF;
        normal = null;
        reduced = new BigDecimal(5);

        test = new Rate(kind,null,reduced,reducedPeriod,normalPeriod);

    }



    //Task 3


    @org.junit.Test
    public void MoreThan8Visitor()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);

        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.VISITOR;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,16);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("7.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void EqualTo8Visitor()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);

        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.VISITOR;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,9);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("0.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void LessThan8Visitor()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.VISITOR;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(2,7);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("0.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostLessThan3ManagementFreePeriod()
    {
        a = new Period(4,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(1,3);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("3.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostGreaterThan3Management()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,19);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("30.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostLessThan3Management()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(3,5);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("3.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostLessThan550Student()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(4,6);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("2.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostGreaterThan550Student()
    {
        a = new Period(13,18);
        b = new Period(7,12);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        normalPeriods.add(b);


        normal = new BigDecimal(12.5);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(6,8);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("7.25");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostGreaterThan16Staff()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.STAFF;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,19);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("16.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void CostLessThan16Staff()
    {
        a = new Period(2,6);
        b = new Period(14,16);

        c = new Period(7,12);
        d = new Period(17,19);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        reducedPeriods.add(b);

        normalPeriods.add(c);
        normalPeriods.add(d);


        normal = new BigDecimal(4);
        reduced = new BigDecimal(1);

        CarParkKind kind = CarParkKind.STAFF;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(7,19);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("16.00");

        assertEquals(result,outcome);
    }

    @org.junit.Test
    public void StaffRateTest()
    {
        a = new Period(16,18);
        b = new Period(8,15);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        reducedPeriods.add(a);
        normalPeriods.add(b);


        normal = new BigDecimal(7);
        reduced = new BigDecimal(3);

        CarParkKind kind = CarParkKind.STAFF;

        Rate test = new Rate(kind, normal, reduced, reducedPeriods, normalPeriods);
        Period stay = new Period(9,10);
        BigDecimal result = test.calculate(stay);

        BigDecimal outcome = new BigDecimal("7.00");

        assertEquals(result,outcome);
    }



}
