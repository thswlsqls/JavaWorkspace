package day22;


class showThisEvents{
	public void showThisEvents() {System.out.println("�̴��� �̺�Ʈ���� ��ȸ�մϴ�.");}
}
class showAllEvents{
	public void showAllEvents() {System.out.println("��� �̺�Ʈ���� ��ȸ�մϴ�.");}
}

public class Quiz_Event {
	public static void main(String[] args) {
		showThisEvents te = new showThisEvents();
		showAllEvents ae = new showAllEvents();
		te.showThisEvents();
		ae.showAllEvents();
	}
}
