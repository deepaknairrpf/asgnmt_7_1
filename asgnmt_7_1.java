import java.util.Scanner;
public class asgnmt_7_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numbrArray[]={1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index you wanna access");
        int index = sc.nextInt();
       try {
        System.out.println("The element at " + index +" is "+ numbrArray[index]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println(e + "\n The elements in the array was");
    	   System.out.println(numbrArray[0]+","+numbrArray[1]+","+numbrArray[2]);
    	   
       }
       finally
       {
    	   System.out.println("End of Program");
       }
	} 

}
