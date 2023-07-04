package day19.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {
		
		//���� �ð��� Date ��ü�� ����(java.util)
		Date now = new Date();
		System.out.println(now);
		
		//Date ��ü => ���ڿ���
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd EE���� HH:mm:ss");
		String str = format.format(now);
		System.out.println(str);
		
		//���ڿ� => Date ��ü
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str = "2023-06-27 18:00:00";
		Date date = format.parse(str);
		System.out.println(date);
		
		//Date ��ü���� �ð��븦 ����ϴ� ����
		date = new Date();
		// ���ϴ� ���� ����
        DateTimeFormatter formatter = 
        		DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzzz");

        // �ð��� ���� ����. �ý��ۿ��� �����ϴ� �⺻��
        ZoneId zoneId = ZoneId.systemDefault();

        // Date ��ü�� ZonedDateTime���� ��ȯ
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), zoneId);
        
        // �ð��� ������ �����Ͽ� ���ڿ��� ��ȯ
        String formattedDateTime = zonedDateTime.format(formatter);
        
        // ��� ���
        System.out.println(formattedDateTime);
	}

}
