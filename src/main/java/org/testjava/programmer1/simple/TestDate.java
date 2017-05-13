package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Alain on 13/05/2017.
 */
public class TestDate {

	public static final Logger LOG = LoggerFactory.getLogger(TestDate.class);

	public static void main(String args[]) {
		test1();
		//test2();
	}

	private static void test1() {

		// LocalDate

		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2017, 5, 12);
		LocalDate d3 = LocalDate.of(2017, Month.MAY, 12);

		// retourne d1=2017-05-13,d2=2017-05-12,d3=2017-05-12
		LOG.info("d1={},d2={},d3={}", d1, d2, d3);

		LocalDate d4 = LocalDate.parse("2017-05-12");

		//retourne : getDayOfMonth=12,getDayOfWeek=FRIDAY,getDayOfYear=132,getMonth=MAY,getMonthValue=5,getYear=2017
		LOG.info("getDayOfMonth={},getDayOfWeek={},getDayOfYear={}," +
						"getMonth={},getMonthValue={},getYear={}",
				d4.getDayOfMonth(),
				d4.getDayOfWeek(),// objet de type DayOfWeek
				d4.getDayOfYear(),
				d4.getMonth(), // de type Month
				d4.getMonthValue(),
				d4.getYear());

		Assert.equals(d4.getDayOfMonth(), 12);
		Assert.equals(d4.getDayOfWeek(), DayOfWeek.FRIDAY);
		Assert.equals(d4.getDayOfYear(), 132);
		Assert.equals(d4.getMonth(), Month.MAY);
		Assert.equals(d4.getMonthValue(), 5);
		Assert.equals(d4.getYear(), 2017);

		LocalDate d5 = LocalDate.parse("2017-04-01");
		LocalDate d6 = LocalDate.parse("2017-05-06");

		// retourne : d5=2017-04-01,d6=2017-05-06, isAfter : false, isBefore : true, equals : false
		LOG.info("d5={},d6={}, isAfter : {}, isBefore : {}, equals : {}", d5, d6, d5.isAfter(d6), d5.isBefore(d6), d5.equals(d6));

		LocalDate d7 = LocalDate.parse("2017-03-01");

		// retourne : d7=2017-03-01, d7.plusDays(1)=2017-03-02, d7.plusMonths(1)=2017-04-01, d7.plusWeeks(1)=2017-03-08,d7.plusYears(1)=2018-03-01
		LOG.info("d7={}, d7.plusDays(1)={}, d7.plusMonths(1)={}, d7.plusWeeks(1)={},d7.plusYears(1)={}",
				d7, d7.plusDays(1), d7.plusMonths(1), d7.plusWeeks(1), d7.plusYears(1));

		// au pluriel
		Assert.equals(d7.plusDays(1), LocalDate.parse("2017-03-02"));
		Assert.equals(d7.plusMonths(1), LocalDate.parse("2017-04-01"));
		Assert.equals(d7.plusWeeks(1), LocalDate.parse("2017-03-08"));
		Assert.equals(d7.plusYears(1), LocalDate.parse("2018-03-01"));
		Assert.equals(d7.plus(Period.ofDays(1)), LocalDate.parse("2017-03-02"));
		Assert.equals(d7.plus(Period.ofMonths(1)), LocalDate.parse("2017-04-01"));
		Assert.equals(d7.plus(Period.ofWeeks(1)), LocalDate.parse("2017-03-08"));
		Assert.equals(d7.plus(Period.ofYears(1)), LocalDate.parse("2018-03-01"));

		LocalDate d8 = LocalDate.of(2017, 01, 31);

		// retourne : d8=2017-01-31, d8.plusMonths(1)=2017-02-28
		LOG.info("d8={}, d8.plusMonths(1)={}", d8, d8.plusMonths(1));

		// retourne le dernier jour du mois suivant !!!!
		Assert.equals(d8.plusMonths(1), LocalDate.of(2017, 2, 28));

		LocalDate d9 = LocalDate.parse("2017-03-01");

		Assert.equals(d9.withDayOfMonth(5), LocalDate.parse("2017-03-05"));
		Assert.equals(d9.withDayOfYear(15), LocalDate.parse("2017-01-15"));
		Assert.equals(d9.withMonth(4), LocalDate.parse("2017-04-01"));
		Assert.equals(d9.withYear(2015), LocalDate.parse("2015-03-01"));

		LocalDate d10 = LocalDate.parse("2017-03-12");

		Assert.equals(d10.atTime(12, 15), LocalDateTime.parse("2017-03-12T12:15:00"));
		Assert.equals(d10.atTime(12, 15, 30), LocalDateTime.parse("2017-03-12T12:15:30"));
		Assert.equals(d10.atTime(12, 15, 30, 530), LocalDateTime.parse("2017-03-12T12:15:30.000000530"));
		Assert.equals(d10.atTime(LocalTime.of(17, 4)), LocalDateTime.parse("2017-03-12T17:04:00"));

		LocalDate d11 = LocalDate.parse("2017-03-15");

		// nombre de jours depuis le 01/01/1970
		Assert.equals(d11.toEpochDay(), 17240L);

		// LocalTime

		LocalTime t = LocalTime.now();
		LocalTime t2 = LocalTime.of(6, 53);
		LocalTime t3 = LocalTime.of(6, 42, 26);
		LocalTime t4 = LocalTime.of(6, 42, 26, 789);
		LocalTime t5 = LocalTime.parse("10:30:45");

		// retourne : t=19:21:46.598, t2=06:53, t3=06:42:26, t4=06:42:26.000000789, t5=10:30:45
		LOG.info("t={}, t2={}, t3={}, t4={}, t5={}", t, t2, t3, t4, t5);

		// retourne MIN=00:00, MAX=23:59:59.999999999, MIDNIGHT=00:00, NOON=12:00
		LOG.info("MIN={}, MAX={}, MIDNIGHT={}, NOON={}",
				LocalTime.MIN, LocalTime.MAX, LocalTime.MIDNIGHT, LocalTime.NOON);

		LocalTime t6 = LocalTime.of(6, 42, 26, 789);

		// au singulier
		Assert.equals(t6.getHour(), 6);
		Assert.equals(t6.getMinute(), 42);
		Assert.equals(t6.getSecond(), 26);
		Assert.equals(t6.getNano(), 789);

		LocalTime t7 = LocalTime.of(8, 42);

		// au pluriel
		Assert.equals(t7.plusHours(1), LocalTime.of(9, 42));
		Assert.equals(t7.plusMinutes(2), LocalTime.of(8, 44));
		Assert.equals(t7.plusSeconds(10), LocalTime.of(8, 42, 10));
		Assert.equals(t7.plusNanos(632), LocalTime.of(8, 42, 0, 632));
		Assert.equals(t7.plus(Duration.ofHours(2)), LocalTime.of(10, 42));

		LocalTime t8 = LocalTime.of(8, 42);

		Assert.equals(t8.withHour(3), LocalTime.of(3, 42));
		Assert.equals(t8.withMinute(20), LocalTime.of(8, 20));
		Assert.equals(t8.withSecond(56), LocalTime.of(8, 42, 56));
		Assert.equals(t8.withNano(951), LocalTime.of(8, 42, 0, 951));

		LocalTime t9 = LocalTime.of(8, 42);

		Assert.equals(t8.atDate(LocalDate.parse("2017-03-12")), LocalDateTime.parse("2017-03-12T08:42:00"));

		// classe Period

		// pluriel
		Period p1 = Period.of(3, 5, 7);
		Period p2 = Period.ofYears(3);
		Period p3 = Period.ofMonths(3);
		Period p4 = Period.ofDays(3);
		Period p5 = Period.ofWeeks(4);

		// retourne : p1=P3Y5M7D, p2=P3Y, p3=P3M, p4=P3D, p5=P28D
		LOG.info("p1={}, p2={}, p3={}, p4={}, p5={}", p1, p2, p3, p4, p5);

		Period p6 = Period.parse("P1Y");
		Period p7 = Period.parse("P-1M");
		Period p8 = Period.parse("P1W");
		Period p9 = Period.parse("P1D");
		Period p10 = Period.parse("P1Y-3M+5D");
		Period p10b = Period.parse("P1Y4W");
		Period p10c = Period.parse("P1Y5M4W7D");

		//retourne : p6=P1Y, p7=P-1M, p8=P7D, p9=P1D, p10=P1Y-3M5D, p10b=P1Y28D
		LOG.info("p6={}, p7={}, p8={}, p9={}, p10={}, p10b={}", p6, p7, p8, p9, p10, p10b);

		LocalDate dp1 = LocalDate.parse("2017-03-01");
		LocalDate dp2 = LocalDate.parse("2017-03-03");
		Period p11 = Period.between(dp1, dp2);
		Period p12 = Period.between(dp2, dp1);

		Assert.equals(p11, Period.parse("P2D"));
		Assert.equals(p11, Period.parse("P2d"));
		Assert.equals(p11, Period.parse("p2d"));
		Assert.equals(p12, Period.parse("p-2d"));

		Period p13 = Period.of(0, 0, 0);
		Period p14 = Period.parse("P-20D");

		Assert.equals(p13.isZero(), true);
		Assert.equals(p13.isNegative(), false);
		Assert.equals(p14.isNegative(), true);

		Period p15 = Period.parse("P1D");

		// au pluriel + pas de plusWeeks (=minus*)
		Assert.equals(p15.plusDays(5L), Period.parse("P6D"));
		Assert.equals(p15.plusMonths(-3L), Period.parse("P-3M1D"));
		Assert.equals(p15.plusYears(1L), Period.parse("P1Y1D"));
		Assert.equals(p15.plus(Period.ofDays(3)), Period.parse("P4D"));
		Assert.equals(p15.multipliedBy(3), Period.parse("P3D"));
		// les jours/mois/années sont ajoutés individuellements sans normaliser le resultat
		Assert.equals(p15.plusDays(31L), Period.parse("P32D"));

		Period p16 = Period.parse("P1Y2M3W4D");

		// au pluriel et pas de weeks
		Assert.equals(p16.getDays(), 3 * 7 + 4); // == 25
		Assert.equals(p16.getMonths(), 2);
		Assert.equals(p16.getYears(), 1);

		// DateTimeFormatter

		LocalDate date1 = LocalDate.of(2017, 5, 23);
		LocalTime time1 = LocalTime.of(14, 5, 23, 457);
		LocalDateTime dateTime1 = date1.atTime(time1);

		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		Assert.equals(f1.format(date1), "mardi 23 mai 2017");

		// LONG ou FULL ne fonctionnent pas
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		Assert.equals(f2.format(time1), "14:05:23");

		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		Assert.equals(f3.format(dateTime1), "23 mai 2017 14:05:23");

		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
		Assert.equals(f4.format(dateTime1), "mardi 23 mai 2017 14:05:23");

		// liste des FormatStyle.FULL

		DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		Assert.equals(f5.format(date1), "mardi 23 mai 2017");

		DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		Assert.equals(f6.format(date1), "23 mai 2017");

		DateTimeFormatter f7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		Assert.equals(f7.format(date1), "23 mai 2017");

		DateTimeFormatter f8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		Assert.equals(f8.format(date1), "23/05/17");

		DateTimeFormatter f9 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		Assert.equals(f9.format(time1), "14:05:23");

		DateTimeFormatter f10 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		Assert.equals(f10.format(time1), "14:05");

		// les formateurs standards

		Assert.equals(DateTimeFormatter.BASIC_ISO_DATE.format(date1), "20170523");
		Assert.equals(DateTimeFormatter.ISO_DATE.format(date1), "2017-05-23");
		Assert.equals(DateTimeFormatter.ISO_LOCAL_DATE.format(date1), "2017-05-23");
		Assert.equals(DateTimeFormatter.ISO_TIME.format(time1), "14:05:23.000000457");
		Assert.equals(DateTimeFormatter.ISO_LOCAL_TIME.format(time1), "14:05:23.000000457");
		Assert.equals(DateTimeFormatter.ISO_DATE_TIME.format(dateTime1), "2017-05-23T14:05:23.000000457");
		Assert.equals(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime1), "2017-05-23T14:05:23.000000457");

		// ofPattern

		DateTimeFormatter f11 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		Assert.equals(f11.format(date1), "2017/05/23");

		// formatage

		Assert.equals(date1.format(DateTimeFormatter.ISO_DATE), "2017-05-23");
		Assert.equals(time1.format(DateTimeFormatter.ISO_TIME), "14:05:23.000000457");
		Assert.equals(dateTime1.format(DateTimeFormatter.ISO_DATE_TIME), "2017-05-23T14:05:23.000000457");
		Assert.equals(DateTimeFormatter.ISO_DATE.format(date1), "2017-05-23");

		// parsing

		Assert.equals(LocalDate.parse("2017-05-23"), date1);
		Assert.equals(LocalDate.parse("2017-05-23", DateTimeFormatter.ISO_DATE), date1);

		Assert.equals(LocalTime.parse("14:05:23.000000457"), time1);
		Assert.equals(LocalTime.parse("14:05:23.000000457", DateTimeFormatter.ISO_TIME), time1);

		Assert.equals(LocalDateTime.parse("2017-05-23T14:05:23.000000457"), dateTime1);
		Assert.equals(LocalDateTime.parse("2017-05-23T14:05:23.000000457", DateTimeFormatter.ISO_DATE_TIME), dateTime1);

		// ????
		//Assert.equals(DateTimeFormatter.ISO_DATE.parse("2017-05-23"), date1);


	}

}
