package ch02;

public class VarEx4 {
    public static void main(String[] args) {
    	// ���ͳ��� Ÿ�԰� ���̻�
    	int octNum = 010;   //8���� 10, 10������ 8
    	int hexNum = 0x10;  // 16���� 10, 10������ 16
    	int binNum = 0b10;   //2���� 10, 10������ 2(JDK 1.7�������� ��밡��
    	
    	// ���� �߰��� _ �� JDK 1.7�������� ��밡��
    	long big = 100_000_000_000L;   // long big = 100000000000L;
    	long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;
    	
    	float pi = 3.14f;    //���̻� f��� F�� ����ص� �ȴ�
    	double rate = 1.618d;   // ���̻� d��� D�� ����ص� �ǰ�, �����ص� �ȴ�.
    	// float pi = 3.14;  //����. floatŸ�� ������ doubleŸ�� ���ͷ� ����Ұ�
    	//double rate = 1.18;  // OK. ���̻� d�� ������ �� �ִ�.
    	
    	//Ÿ���� ����ġ
    	int i = 'A';  //OK. ���� 'A'�� �����ڵ� �� 65�� ���� i�� ����ȴ�.
    	long l =123;  //OK. int���� longŸ���� �� ������ �д�.
        double d = 3.14f;   // OK. float���� doubleŸ���� �� ������ �д�.
        //int i1 =0x123456789L;    // ����. int Ÿ���� ������ �Ѵ� ���� ����
        //float f = 3.14;      // ����.float Ÿ�Ժ��� doubleŸ���� ������ �д�
        byte b = 65;      // OK. byteŸ�Կ� ���� ������ ������ int Ÿ�� ���ͳ�
        short s = 0x1234;    // OK. shortŸ�Կ� ���� ������ ������ int Ÿ�� ���ͳ�
    }
}
