class BasicBox{
	public void basicWrap(){System.out.println("basic wrap");}
}

class PaperBox extends BasicBox{
	public void paperWrap(){System.out.println("paper wrap");}
}

class GoldBox extends PaperBox{
	public void goldWrap(){System.out.println("gold wrap");}
}


class InstanceOfEx3 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
	}
	public static void wrapBox(Object box){

		if(box instanceof GoldBox){
		// �Ű������� �ڷ����� Object�̹Ƿ� ��� ������ �����͸� �Ű������� ���� �� ����
			((GoldBox)box).goldWrap();
		}else if(box instanceof PaperBox){
			((PaperBox)box).paperWrap();
		}else if(box instanceof BasicBox){
			((BasicBox)box).basicWrap();
			//Object�� �޾ұ� ������ BasicBox�� �ƴ� ObjectŬ�������� basicWrap() �޼ҵ带 �����Ű�Ƿ� ���� ����
			//BasicBoxŬ������ ����ȯ�� �ؾ� ��
		}
		
	}
}
