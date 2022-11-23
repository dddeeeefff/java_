class ToStringEx {
//이름과 거주도시를 저장할 수 있는 클래스 생성(인스턴스 생성과 동시에 초기화 진행)
	private String name, city;
	public ToStringEx(String name, String city){ // name, city를 받는 생성자 생성
		this.name = name;	this.city = city;
	}
	// 이름과 도시를 보여주는 toString() 메소드를 오버라이딩
	public String toString(){
		return "이름 : " + name + ", 도시 : " + city;
	}
}
// 생성자 -> 인스턴스(new 붙여 생성)

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("홍길동","서울"); // 인스턴스 생성
		System.out.println(ts1.toString());
		// 오버라이딩 후 : 이름 : 홍길동, 도시 : 서울

		ToStringEx ts2 = new ToStringEx("전우치","부산");
		System.out.println(ts2);
		// 오버라이딩 후 : 이름 : 전우치, 도시 : 부산
	}
}
