package basicPackage;

public class _002DataTypes {
    public static void main(String[] args) {
 variableTypes();
    }

    public static void variableTypes(){
        byte b = 127;

        System.out.println(Integer.toBinaryString(128));
        System.out.println(Integer.toBinaryString(127));

        short sh = 15;
        int x = 1254;
        long lg = 15475 ;

        float fl = 154616.61548454f;
        double db = 15451545.5154515151215485;

        char ch = 'A';
        boolean flag =true;

        System.out.println(sh+"\n"+x+"\n"+lg+"\n"+fl+"\n"+db);
    }

}
