package in.ineuron;

public class Labell
{  
public static void main(String args[])   
{  
int i = 0;  
whilelabel:   
while (i < 5)   
{  
System.out.println("outer value of i= " + i);  
i++;  
forlabel:   
for (int j = 0; j < 5; j++)   
{  
if (j > 0)   
{  
//execution transfer to the for loop      
continue forlabel;  
}  //end of if  
if (i > 1)   
{  
//execution transfer to the while loop      
continue whilelabel;   // can also use continue to skip the outer loop execution.
}  //end of if  
System.out.println("inner value of i= " + i + ", j= " + j);  
}  //end of for  
}  //end of while  
}  //end of main  
}  