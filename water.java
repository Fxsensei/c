import java.util.Scanner;

public class breakdown {
   
    public static void main(String[] args) throws Exception {
    
   breakdown n = new breakdown();
    n.table();

 
}

public void table(){
Scanner n = new Scanner(System.in);
System.out.println("");
System.out.println("");
System.out.println("Enter volume of Water needed/ used: ");
double num1 =n.nextDouble();

if(num1 <= 6){
    double  num = num1 * 17.50;
    double s = Math.round(num);
  
    double VAT = 15.0/100 ;
    double CVAT = VAT * num ;
    double V = Math.round(CVAT);
    
    double total = CVAT + num;
    double r = Math.round(total);

    System.out.println("Total Consumption "+ num1);
    System.out.println("");
     System.out.println("--------------Breakdown-----------------------------------");
     System.out.println("");
     System.out.println( num1 + " x 17.50");
     System.out.println("Total consumption including VAT = " + s);
     System.out.println("VAT : 15% = "+ V);
     System.out.println("Total consumption including VAT = " +r);
     System.out.println("");
     System.out.println("");


  
}

else if(num1 <=10.5){
    double num2 =  6 * 17.50 + (num1 - 6) * 24.39;
   
    double s = Math.round(num2);
  
    double VAT = 15.0/100 ;
    double CVAT = VAT * num2 ;
    double V = Math.round(CVAT);
    
    double total = CVAT + num2;
    double r = Math.round(total);



    System.out.println("Total Consumption "+ num1);
    System.out.println("");
     System.out.println("--------------Breakdown-----------------------------------");
     System.out.println("");
     System.out.println(" 6 x 17.50 + ("+ num1 +"- 6) x 24.39");
     System.out.print("Total consumption including VAT = " + s);
     System.out.println("VAT : 15% = "+ V);
     System.out.println("Total consumption including VAT = " +r);
    
     System.out.println("");
     System.out.println("");
   
   

}


else if (num1 <=35){
    
    

    double num3 =  6 * 17.50 + 10.5 * 24.39 +(num1 - 6 - 10.5)* 34.63;
    
    double s = Math.round(num3);
  
    double VAT = 15.0/100 ;
    double CVAT = VAT * num3 ;
    double V = Math.round(CVAT);
    
    double total = CVAT + num3;
    double r = Math.round(total);


    System.out.println("Total Consumption "+ num1);
  System.out.println("");
   System.out.println("--------------Breakdown-----------------------------------");
   System.out.println("");
     System.out.println("6*17.50 + 10.5*24.39 + (" +num1 + " - 6 - 10.5) * 34.63");
     System.out.println("Total consumption excluding VAT = "+s);
   System.out.println("VAT : 15% = "+ V);
     System.out.println("Total consumption including VAT = " +r);
     System.out.println("");
     System.out.println("");


}
else if(num1 >35){
   
    
   
    double num4 = 6 *17.50 + 10.5*24.39 + 35*34.63 + (num1 - 6 -10.5 -35) * 76.04;  
    double s = Math.round(num4);
  
    double VAT = 15.0/100 ;
    double CVAT = VAT * num4 ;
    double V = Math.round(CVAT);
    
    double total = CVAT + num4;
    double r = Math.round(total);
   
    
   System.out.println("Total Consumption "+ num1);
  System.out.println("");
   System.out.println("--------------Breakdown-----------------------------------");
   System.out.println("");
   System.out.println( "6 *17.50 + 10.5*24.39 + 35*34.63 + ("+num1+" - 6 -10.5 -35) * 76.04");
   System.out.println("");
   System.out.println("Total consumption excluding VAT = "+s);
   System.out.println("VAT : 15% = "+ V);
   System.out.println("Total consumption including VAT = " + r);
   System.out.println("");
   System.out.println("");

   
   
   
   
    
}
}

}



    


