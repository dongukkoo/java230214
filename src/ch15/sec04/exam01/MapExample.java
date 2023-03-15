package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수

		// 여기에 코드를 작성하세요.
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			totalScore += val;
			if(val>maxScore) {
				maxScore = val;
				name = key;
			}
			
		}
		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
	}
}
