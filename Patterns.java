package Topics;

class Patterns {
    public static void main(String[] args) {
        
//TODO:  Square
                                                          //  *****
        /*int n=4;                                        //  *****
        for(int i=0;i<n;i++){                             //  *****
            for(int j=0;j<=i;j++) {                       //  *****
                System.out.print("*");
            }
            System.out.println();
        }*/

//TODO:  Hollow rectangle
                                                          //  *****
        /*int n=4;                                        //  *   *
        for(int i=1; i<=n ; i++){                         //  *   *
            for(int j=1; j<=5 ; j++){                     //  *****
                if(i==1 || i==4  || j==1 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//TODO:  Hollow Rectangle

        /*int n = 5; // Size of the pattern

        // Print the top row
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the middle rows
        for (int i = 1; i < n - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Print the bottom row
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();*/

        // half triangle 180 degree
                                                                    //   *
        //?  1st method                                            //   **
        /*int n=4;                                                //   ***
        for(int i=0;i<n;i++){                                    //   ****
            for(int j=0;j<4;j++){
                if(i==3 || j==3){
                    System.out.print("*");
                }else if( (i==1 && j==2) || (i==2 && j==1) || (i==2 && j==2) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //?  2nd method

        /*int n=3;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//TODO:  Half pyramid with number
                                                                //  0
        /*int n = 5;                                            //  01
        for(int i = 0 ; i < n ; i++ ){                          //  012
            for(int j = 0 ; j <= i ; j++ ){                     //  0123
                System.out.print( j );                          //  01234
            }
            System.out.println();
        }*/

        // reverse pyramid of number

        /*int n = 0;                                           //  01234
        for(int i = 5 ; i > n ; i-- ){                         //  0123
            for(int j = 0 ; j < i ; j++ ){                     //  012
                System.out.print( j );                         //  01
            }                                                  //  0
            System.out.println();
        }*/

//TODO:  Floyd's Triangle

        /*int sum=0;                                            //    1
        int n=5;                                                //    2 3
        for(int i=0; i<n ; i++){                                //    4 5 6
            for(int j=0; j<=i; j++){                            //    7 8 9 10
                System.out.print(sum+ " ");                     //    11 12 13 14 15
                sum++;
            }
            System.out.println();
        }*/

//TODO:  0-1 Triangle

        /*int n=5;

        for(int i=1; i<=n; i++){                             //  1
            for(int j=1; j<=i; j++ ){                        //  01
                int sum= i+j;                                //  101
                if(sum%2==0){                                //  0101
                    System.out.print("1");                   //  01010
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

//TODO:  Solid Rhombus

        /*int n=4;                                              //               *****
        for(int i=n; i>0; i--){                                 //              *****
            for(int j=0; j<i; j++){                             //             *****
                System.out.print(" ");                          //            *****
            }
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//TODO:  Hollow Rhombus

        /*int n=5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        /*int n=5;
        for(int i=n; i>0; i--){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
                if(i==1 || i==5){
                    System.out.print("*****");
                }else{
                    System.out.print("*" + "   " + "*");
                }

            System.out.println();
        }*/

//TODO: Number pyramid

        /*int n=5;                                           //           1
        int num=1;                                           //          2 2
        for(int i=0; i<n; i++){                              //         3 3 3
            for(int j=0; j<n-i; j++){                        //        4 4 4 4
                System.out.print(" ");                       //       5 5 5 5 5
            }
            for(int j=0; j<=i; j++){
                System.out.print(num+ " ");
            }
            num++;
            System.out.println();
        }*/

//TODO:  Palindromic Number Pyramid

        /*int n=5;                                                  //            1
        for(int i=1;i<=n;i++){                                      //           212
            for(int j=1;j<=n-i;j++){                                //          32123
                System.out.print(" ");                              //         4321234
            }                                                       //        543212345
            for(int j=0; j<i; j++){
                System.out.print(i-j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*int n=5;                                                  //            1
        for(int i=1;i<=n;i++){                                      //           212
            for(int j=1;j<=n-i;j++){                                //          32123
                System.out.print(" ");                              //         4321234
            }                                                       //        543212345
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

//TODO:  Butterfly Pattern

        /*int n=4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=space; j>0;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=space; j>0;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//TODO:  Hollow Butterfly

        /*int n=5;
        for(int i=1; i<=n; i++){
            System.out.print("*");
            for(int j=2; j<i; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }

            int space=2*(n-i);
            for(int j=space;j>=1;j--){
                System.out.print(" ");
            }

            System.out.print("*");
            for(int j=2; j<i; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            System.out.print("*");
            for(int j=2; j<i; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }

            int space=2*(n-i);
            for(int j=space;j>=1;j--){
                System.out.print(" ");
            }

            System.out.print("*");
            for(int j=2; j<i; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            System.out.println();
        }*/

//TODO:  Diamond Shape

        /*int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

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

        /*int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }*/
    }
}