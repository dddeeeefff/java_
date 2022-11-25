interface SimpleInterface{
	public void showYourName();
}

class UpperClass{
	public void showYourAncestor(){
		System.out.println("Upper Class");
	}
}

class Aa extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class Aa");}
}

class Bb extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class Bb");}
}

class BoundedTypeParam2 {
	public static void main(String[] args) {
		Aa a = new Aa();		Bb b = new Bb();

		showInstanceAncestor(a);  showInstanceName(a);
		showInstanceAncestor(b);  showInstanceName(b);
	}
	public static <T extends SimpleInterface> void showInstanceAncestor(T param){
	// <T extends SimpleInterface> : SimpleInterface�� ��ӹ޴� �ν��Ͻ��� �ްڴٴ� �ǹ�
	// ���׸��� �ڷ��� ���ѿ����� �������̽��� extends ����� ����� �� ����
		param.showYourName();
	}
	public static <T extends UpperClass> void showInstanceName(T param){
	// <T extends UpperClass> : UpperClass�� ��ӹ޴� �ν��Ͻ��� �ްڴٴ� �ǹ�
		param.showYourAncestor();
	}
}
