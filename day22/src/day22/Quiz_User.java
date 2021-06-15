package day22;


class saveUser{
	public void saveUser() {
		System.out.println("회원 정보를 저장합니다.");
	}
}

class showUser{
	public void showUser() {
		System.out.println("회원 수를 조회합니다.");
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
