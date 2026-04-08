package OOPS.Infosys_Springboard;

class Calculator {
       public double average(int a,int b,int c){
        double ans = (a+b+c)/3.0;
        return ans;
       }
}

class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		double n = calculator.average(12,8,15);
        System.out.println(Math.round(n*100.0)/100.0);
	}
}
