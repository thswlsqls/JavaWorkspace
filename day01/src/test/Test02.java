package test;

public class Test02 {
	public static void main(String[] args) {
		/*
		 escape ���� : ���ڿ��� Ư���� ����� ���� 
		 \n : ���Ϳ� ����ϴ�
		 \t : tab��ŭ ���������� Ŀ���� �̵�
		 \" : "(ū����ǥ) ǥ��
		 \\ : \(��������) ǥ��
		*/
		System.out.println("��\n��\n��\n��\n��");
		System.out.println("1\t1234567\t12345678\t1");
		System.out.println("�ȳ�\"��\"����");
		System.out.println("�� \\ ��");
		
		System.out.println("500" + 100 + 100 );
		System.out.println( 100.123 + 100 + "�ȳ�");
		System.out.println("�ȳ�" + "�ϼ���");
		
		System.out.println("=======================================");
		System.out.println("�̸�\t����\t��ȭ��ȣ\t\tȸ��");
		System.out.println("=======================================");
		System.out.println("ȫ�浿\t\""+15+"\"\t"+3672+"-"+1234+"\t"+"\\"+20000);
		System.out.println("��浿\t\""+15+"\"\t"+2238+"-"+1234+"\t"+"\\"+30000);
		System.out.println("�踻��\t\""+15+"\"\t"+1234+"-"+1234+"\t"+"\\"+50000);
		System.out.println("---------------------------------------");
		System.out.println("���հ�\t\t\t\t\\"+100000);
		System.out.println("---------------------------------------");
	}
}
