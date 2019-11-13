package com.bw.Test;

import java.util.Date;

import org.junit.Test;

import com.bw.utity.DateUtils;

public class test {
		//年龄
		@Test
		public void nl() {
			Integer birth=DateUtils.getAge("2000-10-29");
			System.out.println("今年的年龄是"+birth+"岁");
		}
		//月初
		@Test
		public void yc() {
			Date da=DateUtils.formateStringToDate("2019-09-19 19:29:39");
			System.out.println("月初日期为"+da);
		}
		//月末
		@Test
		public void ym() {
			System.out.println("月末日期为"+DateUtils.ym("2019-09-19 19:29:39"));
		}
		//未来日期
		@Test
		public void wl() {
			System.out.println("距离未来还有"+DateUtils.getFutureDays("2020-01-15")+"天");
		}
		//过去日期
		@Test
		public void gq() {
			System.out.println("过去的天数为"+DateUtils.gq("2000-10-29"));
		}
	
}
