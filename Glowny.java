import  java.util.Random;

public class Glowny {

    public static void main(String[] a){

        Random randomny = new Random();

        int[] spisok = new int[randomny.nextInt(2,55)];
        for(int j=0;j<spisok.length;j++){
            spisok[j]= randomny.nextInt(0,25);
        }

        String poop = "";
        for(int iii=0;iii<spisok.length;iii++){poop=poop+" "+spisok[iii];}
        System.out.println(poop);

        boolean cont = true;
        while(cont){
            int i = 0;
            int ii = 0;
            while (i + 1 < spisok.length) {
                if(spisok[i] > spisok[i + 1]){
                    int vriemiennyj = spisok[i];
                    spisok[i] = spisok[i + 1];
                    spisok[i + 1] = vriemiennyj;
                    poop = "";
                    for(int iii=0;iii<spisok.length;iii++){poop=poop+" "+spisok[iii];}
                    System.out.println(poop);
                }else{ii++;}
                i++;
            }
            if(i==ii)
                cont = false;
        }


    }



}
