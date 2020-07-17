public class zaek {


    public static void main(String[] args) {

        int zaek=0;
        boolean naqdenZaek = false;

        for (zaek = 0; zaek < 10; zaek++) {
            if(zaek>=5){
                naqdenZaek=true;
                break;
            }
        }
        System.out.println(naqdenZaek ? "naqden e" : " ne e naqden");
    }
}
