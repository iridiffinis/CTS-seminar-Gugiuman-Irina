package seminar.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import seminar.teste.AgentieTurismTest;
import seminar.teste.PachetTuristicDiscountTest;
import seminar.teste.PachetTuristicVarstaTest;

@RunWith(Suite.class)
@SuiteClasses({AgentieTurismTest.class, PachetTuristicDiscountTest.class, PachetTuristicVarstaTest.class})
public class SuitaCompleta {

}
