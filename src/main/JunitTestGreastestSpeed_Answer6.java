package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTestGreastestSpeed_Answer6 {

	 GreatestSpeed_Answer6 ans=new  GreatestSpeed_Answer6();
	 
	 @Test
	 void test1() {
		 assertEquals(ans.calculate(7.5), 1, "");
	 }
	 @Test
	 void test2() {
		 assertEquals(ans.calculate(1.6),10,"");
	 }
	 @Test
	 void test3() {
		 assertEquals(ans.calculate(0.005),40,"");
	 }

}