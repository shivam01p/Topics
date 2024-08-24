package Topics;

class Patterns {
    public static void main(String[] args) {
        
//TODO:  Howllow Butterfly 
        
        /*int n=5;
        for(int i=1; i<=n; i++){
           
            System.out.print("*");
            
            for(int j=3; j<=i; j++){
      
                System.out.print(" ");
            }    
            if(i>1){
                    System.out.print("*");
                }
            
            int space= 2*(n-i);
            for(int j=space; j>=1; j--){
                System.out.print(" ");
            }

            System.out.print("*");
            
            for(int j=3; j<=i; j++){
                
                System.out.print(" ");
            
            }
            if (i>1) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n; i>=1; i--){
           
            System.out.print("*");
            
            for(int j=3; j<=i; j++){
      
                System.out.print(" ");
            }    
            if(i>1){
                    System.out.print("*");
                }
            
            int space= 2*(n-i);
            for(int j=space; j>=1; j--){
                System.out.print(" ");
            }

            System.out.print("*");
            
            for(int j=3; j<=i; j++){
                
                System.out.print(" ");
            
            }
            if (i>1) {
                System.out.print("*");
            }

            System.out.println();
        }*/

//TODO  Star
        
        /*int n=4;

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();

        }

        for(int i=n; i>=1; i--){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }*/

//TODO: Pascal Triangle
        /*int n=5;

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if((i==3 && j==2) || (i==4 && j==2) || (i==4 && j==3) || (i==5 && j==2) || (i==5 && j==4)){
                    System.out.print(i-1 + " ");
                }else if(i==5 && j==3){
                    System.out.print(i+1+ " ");
                }
                else{
                    System.out.print("1"+ " ");
                }

            }
            
            System.out.println();
        }*/

        //? 2rd Method
        /*int rows = 5; // Number of rows to print

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }*/

        //? 3rd Method
        /*int rows = 5; // Number of rows to print

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / j;
            }
            System.out.println();
        }*/

//TODO: Print half pyramid of 12345

        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}