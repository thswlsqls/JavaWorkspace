package day22;


class showThisEvents{
	public void showThisEvents() {System.out.println("이달의 이벤트들을 조회합니다.");}
}
class showAllEvents{
	public void showAllEvents() {System.out.println("모든 이벤트들을 조회합니다.");}
}

public class Quiz_Event {
	public static void main(String[] args) {
		showThisEvents te = new showThisEvents();
		showAllEvents ae = new showAllEvents();
		te.showThisEvents();
		ae.showAllEvents();
	}
}
