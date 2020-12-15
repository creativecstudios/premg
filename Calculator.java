package Basics;

import java.util.Arrays;

public class Calculator {
	
	protected int average(int num1,int num2, int num3)
	{
		int result = ((num1+num2+num3)/3);
		System.out.println("The average of 3 num is "+ result);
		return result;
	}
	//variable parameter
    protected int average(int...num1)
	{
		 int count=0;
		 int sum=0;
		for(int i:num1)
		{
			sum = sum+i;
			count++;
		}
		int result = sum/count;
		System.out.println("The average of n numbers is "+result);
		return(result);
	}
    protected int highestCommonFactor(int...inputs)
	{
		int result = 0;
		for(int i=0; i<inputs.length-1; i++)
		{
			while(inputs[i+1]>0)
			{
				int temp = inputs[i+1];
				inputs[i+1]= inputs[i]%inputs[i+1];
				inputs[i]= temp;
				result = inputs[i];
			}
			inputs[i+1]= result;
		}
		System.out.println("The Highest Common Factor is "+result);
		return result;
	}
   protected int leastCommonMultiple(int...inputs)
    {
    	int max,min,x,lcm=0;
    	for(int i=0; i<inputs.length; i++)
    	{
    		for(int j=i+1; j<inputs.length-1; j++)
    		{
    			if(inputs[i]>inputs[j])
    			{
    				max = inputs[i];
    				min = inputs[j];
    			}
    			else
    			{
    				max = inputs[j];
    				min = inputs[i];
    			}
    			for(int k=0; k<inputs.length; k++)
    			{
    				x = k*max;
    				if(x%min==0)
    				{
    					lcm = x;
    				}
    			}
    		}
    	}
    	System.out.println("The Least Common Multiple is "+lcm);
    	return lcm;
    }
}

//To find the maximum number in the array
//int max = arr[0];
//for(int k=1; k<arr.length; k++)
//{
//	if(arr[k]>max)
//		max = arr[k];
//}
//int highestCommonFactor(int...inputs)
//{
//	int hcf =0; 
//	//To store the input into the array
//	int input = 0;
//	int arr[] = new int[inputs.length];
//	for(int j: inputs)
//	{
//		arr[input] = j;
//		input++;
//	}
//	//Highest common factor
//	int result = hcf(arr[0],arr[1]);
//	for(int i=2; i<arr.length; i++)
//	{
//		result = hcf(result,arr[i]);
//	}
//	return result;
//}
////Highest common factor for 2 numbers
//int hcf(int a,int b)
//{
//	while(b>0)
//	{
//		int temp = b;
//		b=a%b;
//		a=temp;
//	}
//	return a;
//}	

