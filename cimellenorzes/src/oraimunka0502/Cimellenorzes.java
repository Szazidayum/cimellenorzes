package oraimunka0502;

import java.util.Scanner;

public class Cimellenorzes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        boolean masodikSzoJo;
        System.out.println(reszek[1]);
        if(reszek[1]=="utca" || reszek[1]=="tér" || reszek[1]=="út"){
            masodikSzoJo=true;
        }else{
            masodikSzoJo=false;
        }
        System.out.println("A második szó jó: "+masodikSzoJo);
    }
}
