package Practice_programs;

public class Pattern2_rightTriangle {

    public static void main(String[] args) {
        
        /*   rows=5
        in each row ,
        spaces = 4,3,2,1,0
        stars =1,2,3,4,5     */
        
        
    for (int i = 0; i < 5; i++) {
           for (int j = 1; j < 5 - i; j++) {
              System.out.print(" ");
           }
           for(int k=0;k<=i;k++){
           System.out.print("@");
           }
           System.out.println();
       }
  }

}
