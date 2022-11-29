import java.util.*;

class QueueEx {
	public static Queue q = new LinkedList(); // ��ɾ ������ Queue
	public static final int MAX_SIZE = 3; // ��ɾ ������ �ִ� ����

	public static void main(String[] args) {
		System.out.println("help �� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while (true){
			System.out.print(" >> ");
			try{
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if(input.equals("")) continue;
				// ��ɾ �Է����� ���� ��� ���๮���� �������� �ʰ� �������� �ö�

				// ��� ��ɾ�� ��ҹ��ڸ� �������� �ʰ� ���۵Ǿ�� ��			equalsignoreCase()
				// q : ���α׷� ����, help : ���� ���, history : �ֱ� �Է��� ��ɾ� 3�� ������
				// �ٸ� ��ɾ��� ��� �ƹ��ϵ� ���� ����
				if(input.equalsIgnoreCase("q")){
					System.exit(0); // ���α׷� ����
				}else if(input.equalsIgnoreCase("help")){
					System.out.println("help - ������ �����ݴϴ�");
					System.out.println("q - ���α׷��� �����մϴ�.");
					System.out.println("history - �ֱ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				}else if(input.equalsIgnoreCase("history")){
					int i = 0; // ��ɾ� ��ȣ�� ����� ����
					save(input); // �Է¹��� ��ɾ q�� ����

					LinkedList tmp = (LinkedList)q;
					// q�� ������ ���� �� �����Ƿ� listIterator() �޼ҵ带 ����� �� �ִ� LinkedList�� ����ȯ
					// �޼ҵ� ù���� �빮�� ����
					ListIterator it = tmp.listIterator();
					while (it.hasNext()){
						i++;
						System.out.println(i + ". " + it.next());
					}

				}else{
					save(input);
					System.out.println(input);
				}
			}
			catch (Exception e){
				System.out.println("�Է¿����Դϴ�");
			}
		}
	}
	public static void save(String input){
		// �޾ƿ� ��ɾ �� ���ڿ��� �ƴϸ� q�� ����
		if(!input.equals("")) q.offer(input);

		// q�� ����� ��ɾ �ִ밳���� ������ q�� �� �տ� �ִ� �����͸� ����
		if(q.size() > MAX_SIZE) q.remove();
	}
}
