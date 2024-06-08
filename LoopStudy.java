public class LoopStudy {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        int i;
        for(i=1;i<=100;++i){
            System.out.println(i);
        }
        // Loop breaks when i = 101
        System.out.println("i is: "+i);
        System.out.println("****************************");

        for(i=0;i<100;i++){
            System.out.println(i+1);
        }
        System.out.println("i is: "+i);

        // While loop
        int n= 5;
        while (n>0) {
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop n is: "+n);

        // Do while loop
        n=5;
        do{
            System.out.println(n);
            n--;
        }while(n>0);

         // While loop
         n= 0;
         while (n>0) {
             System.out.println(n);
             n--;
         }
         System.out.println("After while loop n is: "+n);
 
         // D0-While loop  - it runs atleast once
         n=0;
         do{
             System.out.println(n);
             n--;
         }while(n>0);
    }
    
}