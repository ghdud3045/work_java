package ch02;

public class VarEx1 {
    public static void main (String[] args) {
    	/* ������, �� �ϳ��� ���� ������ �� �ִ� �޸� ����
    	 * ������ �ʱ�ȭ��, ������ ����ϱ� ���� ó������ ���� �����ϴ� ��
    	 */
    	int year = 0;   // ���� year�� ���� �� 0���� �ʱ�ȭ
    	int age = 14;   // ���� age�� ���� �� 14�� �ʱ�ȭ
    	
    	System.out.println(year);   // ���� year�� ������ ���
    	System.out.println(age);    // ���� age�� ������ ���
    	
    	year = age + 2000;   // ���� age�� ���� 2000�� ���ؼ� ���� year�� ����
    	age = age + 1;       // ���� age�� ����� ���� 1 ������Ų��
    	
    	System.out.println(year);
    	System.out.println(age);
    }
}
