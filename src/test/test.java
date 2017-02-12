//reader r= new reader();
	//r.Scan();
	//devide(r.i);
package test;

public class test 
{

	public static void main (String args[])
	{
	
		revRot("733049910872815764", 5);
	}
	
	public static String revRot (String strng, int sz)
{	
	int j=0; 
	int k=0;
	double sumcub;
	double cub=0;
	String str = "";
	String strrev = "";
	String strrot = "";
	String finalstr = "";
	
	if (sz ==0 || sz > strng.length()) {
		return "";
		}
	//перетворення String в масив int
	 
	int [] num = new int [strng.length()];
	for(int i=0; i<strng.length();i++)
	{
		num[i]=strng.charAt(i)-'0';
	}

	//for (int i: num){System.out.print(i);} виведення маисву
	//визначаємо к -- кількість частин на які буде поділено ділимо довжину на
	//розмір однієї частини
	k=num.length/sz;	
	for (int i=0; i<k;i++)//для кожної частини
	{
		sumcub=0;//занулюємо суму кубів і рядок з числами 
		str="";//для перетворення для кожної частини
		for (j=i*sz;j<(i+1)*sz;j++)//для чисел в частині
		{
			cub=Math.pow(num[j],3);
		    sumcub+=cub;//sumcub=sumcub+cub;
		    //System.out.println("Sum for "+i+" "+j+ " :"+sumcub);
		    str+=String.valueOf(num[j]);
		    //str=str+str+=String.valueOf(num[j]););перетворюємо числа в рядок і 
		    //додаємо їх по одному
		}
		//System.out.println(str);
		if (sumcub%2==0) 
			{
			StringBuilder builder = new StringBuilder(str);
			builder.reverse();
			strrev=builder.toString();
			//System.out.println(strrev);
			finalstr+=strrev;
			}
		else
			{
			strrot=str.substring(1)+str.substring(0, 1);
			//System.out.println(strrot);
			finalstr+=strrot;
			}
	}
	System.out.print(finalstr);
	return finalstr;
	
}

}
	//private static void devide(int x){
		//System.out.println(x/10+" "+x%10);
	//}if
//(sz<= 0)return "";
//else
//if 
//(str=="") return "";


