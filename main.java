import java.util.*;     
public class Main  {  
public static void main(String args[]) {  
Scanner t = new Scanner(System.in);
int sum = 0, avg;  
System.out.println("Enter the total no of items in the list");
int n = t.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>();    
int num;
for(int i=0; i<n; i++){
    
    num = t.nextInt();
    list.add(num);
}
for(int i = 0; i < list.size(); i++)  
    sum = sum + list.get(i);  
avg = sum / list.size();   
System.out.println("The average of the List: " + avg);  
}  
}  