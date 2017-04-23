package saharatLab1;
import java.util.*;
public class ArrayOperation {
public class App 
			{
			    
			    {
			        ArrayOperation obj = new ArrayOperation();
			        
			        int sumObj = obj.SumArrays();
			        System.out.println("Sum value is "+sumObj);
			        
			        int maxObj = obj.maxArrays();
			        System.out.println("Max value is "+maxObj);

			        
			    }
			}

			
			private int arr[] = new int[10];
			
			//Constructor Save data to arrays                         
			public ArrayOperation(){                 
				for(int i = 0 ; i<arr.length; i++){
					arr[i] = new Random().nextInt();
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			//Method SumArrays
			public int SumArrays(){
				int sum=0;
				for(int i = 0 ;i<arr.length; i++){
					sum += arr[i];
				}
				return sum;
			}
			
			//Method find MaxArrays
			public int maxArrays(){
				int max=0;
				for(int i = 0 ;i<arr.length; i++){
					max =  Math.max(max,arr[i]);
				}
				return max;
			}

				
		}
