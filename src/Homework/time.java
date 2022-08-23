package Homework;

public class time {
    public static void main(String[] args) {


        //Relations between the second,minute, hour, days,months and year
       // ***************************************************************************

//
//        1 min=60sec
//        1hr=60 min or 60*60
//        1day=24 hr or 24*60min or 24*60*60 sec
//        1month=30 * 1day sec
//        1year=12 months * 1 month sec

//        int sec=1;
//        int min=(sec*60);
//        System.out.println("Number of sec in a minute " +min);
//        System.out.println("Number of minutes in the hour is 60 min or"+ 60*min + "seconds");
//        System.out.println("number of hours in a day is:24");


        //2st August


        //Number of hours in the week, month,year.



//        int day=24;
//        System.out.println("Number of hours in a week are:"+7*day);
//        System.out.println("Number of hours in a month are:" + 30*day +  " or "  +  31*day + " or " + 29*day + " or " + 28*day );
//        System.out.println("Number of hours in a Year if it is leaf are:"+366*day);
//        System.out.println("Number of hours in a normal Year are:"+365*day);





        //Print string using concatination


//        String name="Chetan";
//        String MiddleName="Ravindra";
//        String surname="Wagh";
//        System.out.println(name +" "+MiddleName+" "+surname);



        //Create An array and print it
//
//        int array[]={1,2,3,4,5,6};
//        for(int i=0;i< array.length;i++){
//            System.out.print(array[i]+" ");
//        }


        //Conditional Statement Exercise

        /*

        int a=2; int b=4;int c=5;int d=6;
        if((a+b)>(c+d)){
            System.out.println("a+b is bigger than the c+d");
        }
        else
            System.out.println("a+b is not bigger than the c+d");

         */

        //3rd August

        //Print Diamond pattern

//             *
//            ***
//           *****
//          *******
//           *****
//            ***
//             *





        //This is for the upper triangle



        for(int i=0;i<6;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //code for the lower triangle

        for(int i=4;i>=0;i--){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }




        /*

        //Print Diamond


//             *
//            ***
//           *****
//          *******
//         *********
//          *******
//           *****



        int count=1;
        for(int i=0;i<6;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=2;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<10-count;k++){
                System.out.print("*");
            }
            System.out.println();
            count+=2;
        }

 */

        //Diamond


//          *****
//         *******
//        *********
//         *******
//          *****
//           ***
//            *


/*

        int count=5;
        for(int i=2;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<10-count;k++){
                System.out.print("*");
            }
            System.out.println();
            count-=2;
        }

        for(int i=4;i>=0;i--){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

 */


    }
}

