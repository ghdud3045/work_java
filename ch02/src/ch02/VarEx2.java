package ch02;

public class VarEx2 {
    public static void main(String[] args) {
    	int x = 10, y = 20; // ���� x, y�� �����ϰ�, ���� 10�� 20���� �ʱ�ȭ    	
    	int tmp = 0;         //���� tmp�� �����ϰ�, 0���� �ʱ�ȭ
    	
    	System.out.println("x:" + x + " y:" + y);   //x�� y�� ���
    	
    	tmp = x;   // x�� ���� tmp ������ ����	
    	x = y;     // x������ y���� ����
    	y = tmp;   // y������ tmp ���� ����
    	
    	System.out.println("x:" + x + " y:" + y);   // x�� y�� ���
    	
    	/*
    	 * �� �ڵ��� ����: x�� y���� �ٲ�ġ�� �ϴ� ���
    	 */
    	
    }
}
