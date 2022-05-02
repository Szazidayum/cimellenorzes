package oraimunka0502;

import java.util.Scanner;

public class Cimellenorzes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        boolean helyesE;
        System.out.print("Kérek egy címet: ");
        String cim = sc.nextLine();
        String[] reszek = cim.split(" ");       
        
//      Első betű nagybetű-e?
        boolean nagybetu;
        String elsoSzo = reszek[0];
        if(Character.isUpperCase(elsoSzo.charAt(0))){
           nagybetu=true;
        }else{
            nagybetu=false;
        }
        System.out.println("Az első betű nagybetű-e: "+nagybetu);
        
//      3 szóból áll-e a cím?
        boolean haromHossz;
        if(reszek.length==3){
            haromHossz=true;
        }else{
            haromHossz=false;
        }
        System.out.println("A cím 3 szóból áll-e: "+haromHossz);
        
//      Második szó: utca,tér,út?
        boolean masodikSzoJo=false;
//        System.out.println(reszek[1]);
        if("utca".equals(reszek[1]) || "tér".equals(reszek[1]) || "út".equals(reszek[1])){
            masodikSzoJo=true;
        }
        System.out.println("A második szó jó: "+masodikSzoJo);
        
//      A harmadik szó pontra végződik-e?
        boolean pontE;
        String harmadikSzo=reszek[2];
        char pont=harmadikSzo.charAt(harmadikSzo.length()-1);
        System.out.println(pont);
        
    }
        
}
