package com.javacore.p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

import static com.javacore.itfcImpl.SatsIpt.*;

import com.javacore.itfcImpl.Koala;
import com.javacore.itfcImpl.SatsIpt;


public class Test {

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = "ab".concat("c").concat("d");
		StringBuilder sbr = new StringBuilder("start ");
		StringBuilder sdr = sbr.append("time");
		System.out.println(sbr);
		System.out.println(sdr);
		
		String[][] twoDstrs = new String[3][2];
		for (int i = 0; i < twoDstrs.length; i++) {
			for (int j = 0; j < twoDstrs[i].length; j++) {
				twoDstrs[i][j] = "{"+i+", "+j+"}";
			}
		}
		
		for (int i = 0; i < twoDstrs.length; i++) {
			for (int j = 0; j < twoDstrs[i].length; j++) {
				System.out.println(twoDstrs[i][j]);
			}
		}
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		System.out.println(zdt);
		
		for(int i = 0; i < 10; ) {
			i = ++i;
			System.out.println("haha "+i);
		}
		
		Date dt = new Date();
		
		Calendar cld = Calendar.getInstance();
		Calendar cldg = new GregorianCalendar(2018, Calendar.JULY, 27);
		cld.set(2017,  Calendar.FEBRUARY,  5);
		cld.add(Calendar.DATE, -1);
		dt = cld.getTime();
		dt = cldg.getTime();
				
		System.out.println(dt);
		System.out.println(ld);
		System.out.println(ld.plusWeeks(2));
		System.out.println(ld.minusWeeks(2));
		System.out.println(lt.plusHours(1));
		
		//Collections.sort(list);
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 15);
		LocalDate end = LocalDate.of(2020,  Month.MARCH, 30);
		Period period = Period.ofYears(2);
		
		//System.out.println(ldt.toEpochSecond(ZoneOffset.UTC));
		
		Test.performAnimalEnrichment(start, end, period);
		
		LocalDate lds = LocalDate.of(2030,  Month.AUGUST,  12);
		LocalTime ltd = LocalTime.of(23,  12,  25);
		LocalDateTime ldts = LocalDateTime.of(lds, ltd);
		System.out.println(ldts);
		System.out.println(ldts.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(ldts));
		
		Koala koala = new Koala();
		System.out.println(koala.count);
		koala.count = 5;
		System.out.println(koala.count);
		koala = null;
		System.out.println(koala.count);
		
		stcMtd();
		
		int number = 6;
		System.out.println(number);
		//myAppend(number);
		System.out.println(number);
		
		SatsIpt sats = new SatsIpt();
		sats.result = 7;
		System.out.println(sats.result);
		myAppend(sats);
		System.out.println(sats.result);
		
		SatsIpt sat = new SatsIpt();
		sat.ovrLoad(1);
		sat.ovrLoad((Integer)1);
		short c = 7;
		Integer d = 1;
		sat.intShort(1);
		sat.intShort((short) 2);
		sat.intShort(c);
		sat.ovrLoad(d);
		Object obj = new String("haha");
		//String str = (String) new Object();
		sat.fly(obj);
		sat.fly("hehe");
		sat.fly('c');
	}

}
