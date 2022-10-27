package onboarding;

import java.util.HashMap;

public class Problem4 {
    /**
     * 기능 목록
     * 1. map에 알파벳과 그 역순을 저장
     * 2. word를 한 글자씩 받아서 문자일 경우 대소문자를 구분하며 map으로 변환
     */
    public static String solution(String word) {
        String answer = "";
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < 26; i++) {
            map.put((char) ('A' + i),(char) ('Z' - i));
        }
        return answer;
    }
}
