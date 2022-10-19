package lecture.p01lombok;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor  // final 필드 초기화하는 생성자 생성 
//@AllArgsConstructor
//@NoArgsConstructor
public class JavaBean7 {
	
	private final String name; 	// final : 값을 할당할 기회를 1번만 받음 
	private final int age;
	
}
