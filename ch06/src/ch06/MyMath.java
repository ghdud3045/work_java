package ch06;

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할수 있다
	}
	
	long subreact (long a, long b) { return a - b; }
	long multiply (long a, long b) { return a * b; }
	double divide(double a, double b) {return a /b;}
}
