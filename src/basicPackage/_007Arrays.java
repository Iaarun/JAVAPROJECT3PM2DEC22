package basicPackage;

import java.util.Arrays;

public class _007Arrays {

    // {"545", 54848,"55",true}
    public static void main(String[] args) {
        int[]arr={12,151,64,84,25,101};
   _007Arrays ar = new _007Arrays();
       ar.findsecondMax(arr);
    }

    public void basicArray(){
        int age;
        int arr[];
          arr= new int[5];
        System.out.println(arr);
         age=10;
        Arrays.fill(arr,101);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);


        System.out.println(arr[0]);
        arr[0]=100;
        arr[1]=105;
        arr[2]=130;
        arr[3]=101;
        arr[4]=109;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //iterate
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }

        }
        System.out.println("============");
        //enhance for loop
        for(int x:arr){
            if(x%2==0){
                System.out.println(x);
            }

        }




    }

    public void twoDArray(){
        int[][]arr= new int[2][4];

        System.out.println(arr.length);//2
        System.out.println(arr[0].length);//4

        arr[0][0]=15;
        arr[0][1]=16;
        arr[0][2]=17;
        arr[0][3]=18;
        arr[1][0]=21;
        arr[1][1]=22;
        arr[1][2]=23;
        arr[1][3]=24;

        for(int i=0; i<arr.length;i ++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



       // System.out.println(Arrays.toString(new String[]{Arrays.toString(arr)}));
    }

    public void findmaxofanArray(int[] arr){
        //find max of an array
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }


    public void findsecondMax(int arr[]){
        int firstMax=Integer.MIN_VALUE, secondMax= Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if(arr[i]>firstMax){
                firstMax=arr[i];
            }
         }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondMax && arr[i]!=firstMax){
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
