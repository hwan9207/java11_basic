package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1="yu";
		String name2= new String("유정환");
//		int su1 =1004; // 비교 타입이 달라서 에러
		Integer su1 = 1004; //참조형
		String su2 = "1004";
		String su3 = String.valueOf(su1);
		System.out.println(su1.equals(su2)); 
		System.out.println(su2.equals(su3));
	
		String str = "유정환,최여명,박경진,이은진,김지우";
		String[] names = new String[5];
		System.out.println(names[0]);
		names = str.split(","); //문자열 분리
		
		for(String s : names) {
			System.out.println(s);
		}
		String str2= String.join("/", names); //문자열 합치기
		System.out.println(str2);
		
		String data = " ivE\'s beauty group\nnewjeans is girlGroup Top ";
		
		char ten=data.charAt(9); //10번째 문자(인덱스가 9인 문자)
		
		String trimData = data.trim(); //앞 뒤의 공백을 제거하여 trimData에 저장
		
		int size = data.trim().length(); //글자수를 size에 저장
		
		int n = data.indexOf('n'); //n의 글자 위치를 n에 저장
		
		String up = data.toUpperCase(); //모두 대문자로 변환하여 저장
		
		String down = data.toLowerCase(); // 수문자로 변환 ..
		
		String sub1 = data.substring(20,30); // 공백을 제거하고, 20번째 글자 부터 29번째만 출력 
		
		String sub2 = data.replace("newJenas", "Kepler"); // newJeans의 단어를 Kepler로 변경하여 저장
		
		byte[] girl = data.trim().getBytes(); // 문자열을 girl 문자배열로 변환하여 저장
		
		
//		String girlgroup = data.substring(data.lastIndexOf(g));
		
		
	}
}
