package log4j.exam;

import java.io.IOException;

import org.apache.log4j.Logger;

//Field(instance, static 변수)
public class Log4jExample {
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public void a(){
		logger.info("info 메세지입니다.");
		b();
	}
	
	public void b(){
		logger.warn("warn 메세지입니다.");
		
		c();
	}
	
	public void c(){
		IOException e = new IOException("입출력 오류");
		logger.error("error 메세지입니다.", e);
	}
	
	public static void main(String[] args) {
		Log4jExample ex = new Log4jExample();
		logger.debug("debug메세지입니다");
		ex.a();
	}
}
