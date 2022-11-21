class MemberInfo{
	String id, name;
	MemberInfo(String id, String name){
		this.id = id;	this.name = name;
	}
}


class ArrayForEach2 {
public static void main(String[] args) {
		MemberInfo[] arrMember = new MemberInfo[3];
		// MemberInfo형 인스턴스를 3개 저장할 수 있는 배열 arrMember 생성
		arrMember[0] = new MemberInfo("test1", "홍길동");
		arrMember[1] = new MemberInfo("test2", "전우치");
		arrMember[2] = new MemberInfo("test3", "임꺽정");

		//for-each문으로 arrMember배열이 가진 name들을 출력(가로로)
		for(MemberInfo mi : arrMember) // 생성자 생성 후 사용
		System.out.print(mi.name + " ");
		System.out.println();

		for(MemberInfo mi : arrMember) mi.id = mi.id + "??";
		// arrMember 배열에 있는 MemberInfo	형 인스턴스들의 id값에 "??"를 붙임
		// 변수가 아닌 인스턴스를 변경작업을 하면 원본도 같이 변경됨(값이 아닌 주소값으로 작업하기 때문에)

		for(MemberInfo mi : arrMember) System.out.print(mi.id + " ");
		// test1??  test2?? test3??
		System.out.println();
	}
	
}
