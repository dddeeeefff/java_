class Computer{
// �Ϲ����� ��ǻ���� ����� Ŭ������ ������ ���� ��
	String owner;
	public Computer(String name){owner = name;}
	public void calculate(){System.out.println("��û ������ ó���մϴ�.");}
}

class Notebook extends Computer{ // Notebook is a Computer(Notebook�� ������ Computer�̴�)
// ComputerŬ������ ��ӹ������ν� ComputerŬ������ ���(���)���� �⺻������ ���߰� �ִ� NotebookŬ������ ��
// NotebookŬ�������� Notebook���� ������ ��ɵ��� �����ϸ� �� 
	int battery;
	// Computer���� ����, Notebook���� �ִ� Ư��
	public Notebook(String name, int chag){
		super(name);
		battery = chag;
	}
	public void chaging(){battery += 5;}
	// Computer���� ����, Notebook���� �ʿ��� ���(�޼ҵ�) 
	public void movingCal(){
	// Computer�� �ִ� ��ɿ� Notebook�� ����� ��ģ �޼ҵ�
		if(battery < 1){System.out.println("������ �ʿ��մϴ�."); return;}
		System.out.print("�̵��ϸ鼭 ");
		calculate();
		battery--;

	}
}

class TabletNote extends Notebook{
// ComputerŬ������ ��ӹ��� Notebook�� ��ӹ޾����Ƿ� Computer�� Notebook�� ��ɵ��� ��� ���߰� ����
	String pen;
	// Computer�� Notebook���� ����, TabletNote���� �ִ� Ư��
	public TabletNote(String name, int chag, String pen){
		super(name, chag);
		this.pen = pen;
	}
	public void write(String penInfo){
	// Computer�� Notebook�� �ִ� ��ɿ� TabletNotedml ����� ��ģ �޼ҵ�
		if(battery < 1){System.out.println("������ �ʿ��մϴ�."); return;}
		if(!pen.equals(penInfo)){System.out.println("��ϵ� ���� �ƴմϴ�."); return;}
		System.out.print("�̵��ϸ鼭 �ʱ� ����� ");
		calculate();
		battery--;
	}
}


class ISAInheritance {
	public static void main(String[] args) {
		Notebook nb = new Notebook("ȫ�浿", 5);
		TabletNote tn = new TabletNote("����ġ", 5, "ISE-123-456");

		nb.movingCal();
		tn.write("ISE-123-456");
	}
}
