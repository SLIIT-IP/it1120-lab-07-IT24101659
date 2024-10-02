public class IT24101659Lab7Q2B {
    public static void main(String[] args) {

        int i,j;
        int k =1;

        //outer loop
        for(i = 1; i<=5; i++) {
            System.out.print(i + " - ");

            //Inner Loop
            for(j = 1; j <= k; j++) {
                System.out.print("*" + " ");
                
            }
            k++;
            System.out.print("\n");
        
        }



    }
}
 