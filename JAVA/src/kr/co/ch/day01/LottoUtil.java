package kr.co.ch.day01;

import java.util.Random;


/**
 * 
 * 	로또와 관련된 여러가지 기능을 가지고 있는 클래스
 *  @author 박천호
 * 	@since
 * 	@version
 * 
 */

public class LottoUtil {

	/**
	 * 
	 * 오늘의 로또 확률을 알려주는 기능입니다.
	 * @return 오늘의 로또확률 (0 ~100)
	 */
	
	public static int todayProbability() {
		
		Random r = new Random();
		return r.nextInt(101);
	}
}
