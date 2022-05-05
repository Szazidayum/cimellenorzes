package oraimunka0502;

import java.util.Scanner;



public class Cimellenorzes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        boolean helyesE=false;
               
            while(helyesE==false){
                System.out.print("Kérek egy címet: ");
                String cim = sc.nextLine();
                String[] reszek = cim.split(" ");
              if(haromSzo(reszek)==true && ElsoBetu(reszek)==true && MasodikSzo(reszek)==true && PontE(reszek)==true && SzamE(reszek)==true){
                helyesE=true;
                }else{
                  System.out.println("Nem helyes címet adott meg!");
              }
            }
        System.out.println("A címet helyesen adta meg!");

    } 
        static boolean haromSzo(String[] reszek){
//      3 szóból áll-e a cím? 
        boolean haromHossz;
        if(reszek.length==3){
            haromHossz=true;
            
        }else{
            haromHossz=false;
        }
//        System.out.println("A cím 3 szóból áll-e: "+haromHossz);
        return haromHossz;
    } 
        
    static boolean ElsoBetu(String[] reszek){
//      Első betű nagybetű-e?
        boolean nagybetu;
        String elsoSzo = reszek[0];
        if(Character.isUpperCase(elsoSzo.charAt(0))){
           nagybetu=true;
        }else{
            nagybetu=false;
        }
//        System.out.println("Az első betű nagybetű-e: "+nagybetu);
        return nagybetu;
    }
        
    static boolean MasodikSzo(String[] reszek){
//      Második szó: utca,tér,út?
        boolean masodikSzoJo=false;
//        System.out.println(reszek[1]);
        if("utca".equals(reszek[1]) || "tér".equals(reszek[1]) || "út".equals(reszek[1])){
            masodikSzoJo=true;
        }
//        System.out.println("A második szó jó: "+masodikSzoJo);
        return masodikSzoJo;
    }
   
       static boolean PontE(String[] reszek){
//      A harmadik szó pontra végződik-e?
        boolean pontE;
        String harmadikSzo=reszek[2];
        char ponT=harmadikSzo.charAt(harmadikSzo.length()-1);
//        System.out.println(pont);
        String pont=".";  
        char p=pont.charAt(0);
        if(ponT==p){
            pontE=true;
        }else{
            pontE=false;
        }
//           System.out.println("Az utolsó karakter pont-e: "+pontE);
           return pontE;
        }
       
        static boolean SzamE(String[] reszek){
//      A harmadik szó pont előtti része egy egész szám 1 és 500 között?
//        System.out.println(harmadikSzo);
        boolean szamE;
        String harmadikSzo=reszek[2];
        String harmadikS = "";
           for (int i = 0; i < harmadikSzo.length()-1; i++) {
               harmadikS += harmadikSzo.charAt(i);
           }
//           System.out.println(harmadikS);
        int szam=Integer.parseInt(harmadikS);
//           System.out.println(szam);
        if(0<szam && szam<501){
            szamE=true;
        }else{
            szamE=false;
        }
//           System.out.println("A szám megfelelő: "+szamE);
           return szamE;
       }
        

}