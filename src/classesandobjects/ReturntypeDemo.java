package classesandobjects;

public class ReturntypeDemo {
//    int principal;
//    int roi;
//    int time;

    public double simpleIntrest(int amount, int r, int time ){

        double intrest = (amount*r*time)/100;
        return intrest;
    }

    public void totalAmount(int amount, double si){
        double total = amount+si;
        System.out.println(total);
    }


    public static void main(String[] args) {
        ReturntypeDemo rd = new ReturntypeDemo();
     double intrest=   rd.simpleIntrest(1000,10,2);

        rd.totalAmount(1000, intrest);

    }


}
