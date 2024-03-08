package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamExam {

	public static void main(String[] args) {
		int[] arr = {100,90,80,70,60};
		
		Arrays.stream(arr).forEach(n -> System.out.println(n)); // 스트림. 배열 순회 출력
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average(); // 스트림 이용 평균 계산시 OptionalDouble을 해줘야하는 이유는 정수나 실수중 뭐가 나올지 모르기 때문?
		System.out.println(avg);
		
		OptionalInt max = Arrays.stream(arr).max(); //OptionalDouble 로 하니 오류나네 
		OptionalInt min = Arrays.stream(arr).min();
		
		int cnt = (int) Arrays.stream(arr).count(); // 요수 개수 출력
		System.out.println(cnt);
	}
}
