class MemberInfo{
	String id, name;
	MemberInfo(String id, String name){
		this.id = id;	this.name = name;
	}
}


class ArrayForEach2 {
public static void main(String[] args) {
		MemberInfo[] arrMember = new MemberInfo[3];
		// MemberInfo�� �ν��Ͻ��� 3�� ������ �� �ִ� �迭 arrMember ����
		arrMember[0] = new MemberInfo("test1", "ȫ�浿");
		arrMember[1] = new MemberInfo("test2", "����ġ");
		arrMember[2] = new MemberInfo("test3", "�Ӳ���");

		//for-each������ arrMember�迭�� ���� name���� ���(���η�)
		for(MemberInfo mi : arrMember) // ������ ���� �� ���
		System.out.print(mi.name + " ");
		System.out.println();

		for(MemberInfo mi : arrMember) mi.id = mi.id + "??";
		// arrMember �迭�� �ִ� MemberInfo	�� �ν��Ͻ����� id���� "??"�� ����
		// ������ �ƴ� �ν��Ͻ��� �����۾��� �ϸ� ������ ���� �����(���� �ƴ� �ּҰ����� �۾��ϱ� ������)

		for(MemberInfo mi : arrMember) System.out.print(mi.id + " ");
		// test1??  test2?? test3??
		System.out.println();
	}
	
}
