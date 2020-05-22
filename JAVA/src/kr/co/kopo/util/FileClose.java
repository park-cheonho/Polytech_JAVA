package kr.co.kopo.util;

import java.io.Reader;
import java.io.Writer;

/**
 * 객체 클로즈 하는 것이 목적
 * @author cheonho08@gmail.com
 *
 */
public class FileClose {
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Writer w) {
		if(w != null) { 
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	// 메서드 오버 라이딩!!!
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
}
