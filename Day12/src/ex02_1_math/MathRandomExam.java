package ex02_1_math;

public class MathRandomExam {
	
	public static void main(String[] args) {
		// �ֻ��� ���α׷�
		// 1 ~ 6 ������ ���� ������ �߻�
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("�ֻ��� ��: " + dice);
	}
	
}