package com.qfedu.web.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//自定义日期转换器  字符串转换为Date 
public class DateConverter implements Converter<String, Date>{


	@Override
	public Date convert(String value) {
		// TODO Auto-generated method stub
		System.out.println("自定义转换器");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(value);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
