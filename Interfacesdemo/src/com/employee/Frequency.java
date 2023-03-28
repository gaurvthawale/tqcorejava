package com.employee;

public class Frequency {

	
	public static void frequency(int[] arr)
	{
	int cnt;
		for(int i=0;i<arr.length;i++)
		{
		
			cnt=0;
			if(i%2==0)
			{
				for(int k=0;k<arr.length;k++)
				{
					if((arr[k]%2==0)&&(arr[k]!='\0'))
					{
						System.out.println(arr[k]);
						cnt++;
						arr[k]='\0';
						break;
					}
					
				}
			}
			else
			{
				for(int k=0;k<arr.length;k++)
				{
					if((arr[k]%2!=0)&&(arr[k]!='\0'))
					{
						System.out.println(arr[k]);
						cnt++;
						arr[k]='\0';
						break;
					}
					
				}
				
				
			}
			
			if((arr[i]!='\0')&&(cnt==0))
			{
				System.out.println(arr[i]);	
				arr[i]='\0';
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {2,4,6,8,0};
		frequency(arr);
		System.out.println(arr.length);
	}

}
