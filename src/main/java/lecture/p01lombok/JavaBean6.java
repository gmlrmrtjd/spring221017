package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 모든 필드를 아규먼트로 받는 생성자 생성
@NoArgsConstructor  // 아규먼트 없는 생성자 추가 생성 
public class JavaBean6 {
	private String name;
	private int age;
	
	
}
