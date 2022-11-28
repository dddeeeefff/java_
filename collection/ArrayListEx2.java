import java.util.*;

class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; // 문자열을 리스트로 어떻게 만들지?

		// source의 문자열을 10개씩 잘라 ArrayList에 저장한 후 하나씩 출력
		// List<E>	subList(int fromIndex, int toIndex) : 리스트를 fromIndex 부터 toIndex - 1까지 잘라내어 리스트로 리턴
		// ArrayList(int initialCapacity) : 지정한 initialCapacity를 크기로 하는 ArrayList 생성
		// ArrayList list1 = new ArrayList(source);            substring()
		int length = source.length(); // source : 원본
		List list = new ArrayList(length / LIMIT + 10); // 넉넉하게 잡는게 좋음
		// list는 List형으로 선언했기 때문에 List의 메소드와 ArrayList에서 오버라이딩된 메소드들만
		// 사용할 수 있음(대부분의 메소드가 오버라이딩되어 있기 때문에 성능상의 문제 없음)
		// List로 선언했기 때문에 다른 List객체(LinkedList)로의 형변환이 자유로움
		// ArrayList의 크기는 넉넉하게 잡아주는 것이 좋음
		for(int i = 0; i < length; i += LIMIT){
		// i : subString()의 첫번째 매개변수로 사용할 변수값
			if(i + LIMIT < length){
			// 자를 문자열이 10개 이상 남았으면
				list.add(source.substring(i, i + LIMIT));
			}else{
			// 자를 문자열이 10개가 안되면
				list.add(source.substring(i));
			}
		}
		for(int i = 0; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
	}
}
