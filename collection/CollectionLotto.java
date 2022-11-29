import java.util.*;


class CollectionLotto {
	public static void main(String[] args) {
		// 1~45사이의 정수 6개를 중복되지 않게 저장 후 출력 - 정수는 랜덤
		// 랜덤은 Math클래스에서 이용
		Set set = new HashSet();
		while(set.size() < 6){
		// set의 6개의 숫자가 저장될 때까지 루프를 돔
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num)); // Set이므로 중복된 값은 저장 불가
			// 랜덤으로 추출한 숫자를 Integer형 인스턴스로 생성한 후 set에 저장
		}
		System.out.println(set); // [24, 10, 42, 11, 12, 29]

		// set에 들어있는 숫자들을 오름차순 정렬하여 출력
		// 막힌부분 : set -> list로 형변환 안함(sort는 list에서 사용이 가능하므로 형변환 후 사용해야됨)
		List list = new ArrayList(set); // LinkedList도 가능
		// set은 Collections 인터페이스를 상속받았으므로 List의 인스턴스로 생성 가능
		Collections.sort(list);
		// Collections 클래스의 sort() 메소드는 매개변수의 자료형이 List이므로 set을 이용하여 List형 인스턴스를 생성하여 정렬
		System.out.println(list);
	}
}