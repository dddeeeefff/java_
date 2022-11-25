class OuterClass{
	private String myName;
	private int num;
	OuterClass(String name){
		myName = name;
		num = 0;
	}
	public void whoAreYou(){
		num++;
		System.out.println(myName + "Other Class " + num);
	}
	class InnerClass{
		InnerClass(){whoAreYou(); }
		// innerŬ���������� outerŬ������ ���(private ����)�� ���� ������ �� ����
	}
}

class InnerClassEx {
	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("1st ");
		OuterClass out2 = new OuterClass("2nd ");
		out1.whoAreYou(); // 1st Other Class 1
		out2.whoAreYou(); // 2nd Other Class 1

		OuterClass.InnerClass inn1 = out1.new InnerClass(); // 1st Other Class 2
		OuterClass.InnerClass inn2 = out2.new InnerClass(); // 2nd Other Class 2
		OuterClass.InnerClass inn3 = out1.new InnerClass(); // 1st Other Class 3
		OuterClass.InnerClass inn4 = out1.new InnerClass(); // 1st Other Class 4
		OuterClass.InnerClass inn5 = out2.new InnerClass(); // 2nd Other Class 3
		// innerŬ������ �ν��Ͻ��� �����Ϸ��� �ݵ�� outerŬ������ �ν��Ͻ��� �̿��ؾ� ��
		// innerŬ������ �ν��Ͻ����� outerŬ������ �ν��Ͻ� �ȿ� �����ϰ� ��
	}
}
