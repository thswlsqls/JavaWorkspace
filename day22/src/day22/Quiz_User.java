package day22;


class saveUser{
	public void saveUser() {
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
}

class showUser{
	public void showUser() {
		System.out.println("ȸ�� ���� ��ȸ�մϴ�.");
	}
}

public class Quiz_User {
	public static void main(String[] args) {
		saveUser save = new saveUser();
		showUser show = new showUser();
		save.saveUser();
		show.showUser();
	}
}
