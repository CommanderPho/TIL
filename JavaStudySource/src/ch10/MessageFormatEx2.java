package ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO" + tableName + " VALUES(''{0}'',''{1}'',''{2}'',''{3}'');";
		Object[][] arguments={
				{"������","02-123-1234","27","07-09"},
				{"������","032-333-1234","33","10-07"},
			};
		for(int i=0; i<arguments.length; i++){
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}
/*
 * INSERT INTOCUST_INFO VALUES('������','02-123-1234','27','07-09');
INSERT INTOCUST_INFO VALUES('������','032-333-1234','33','10-07');
 */
}
