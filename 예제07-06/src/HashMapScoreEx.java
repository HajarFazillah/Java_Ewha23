// 예제 7-6 : HashMap을 이용하여 자바 과목의 이름과 점수 관리
// 해시맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
	
	    // 5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : "+javaScore.size());
		
		// 모든 사람의 점수 출력
		// javaScore에 들어 있는 모든 (key,value)
	}

}
