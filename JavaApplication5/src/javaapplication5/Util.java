
package javaapplication5;


import java.util.Scanner;
import java.util.Random;
import static javaapplication5.Config.yar;


public class Util {
    
    
    public static void login(){
    
        
        int giris =3;
        
        while(true) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Logini daxil edin : ");
        String login = sc.nextLine();
         System.out.print("Parolu daxil edin : ");
        String parol = sc.nextLine();
            
            
            
            
        
            if(login.equals("fuad") && parol.equals("123")) {
                System.out.println("Sisteme xosh geldiniz");
              break;
            }
            else if(login.equals("fuad") && !parol.equals("123")) {
            
                System.out.println("Parolunuz yanlishdir");
             giris --;
                System.out.println("Qaliq girish haqqiniz : " +giris);
            }
        else if(!login.equals("fuad") && parol.equals("123")) {
            
                System.out.println("Login yanlishdir");
             giris --;
              System.out.println("Qaliq girish haqqiniz : " +giris);
            }
        else{
        
                System.out.println("Her iki parametr yanlishdir");
          giris--;
                 System.out.println("Qaliq girish haqqiniz : " +giris);
        }
            
            if(giris==0){
                System.out.println("You banned!");
            break;
            }
            
           
    }
}
    
    
    public static void showMenu(){
    System.out.println("1. Yarishmacilari register et \n"
        + "2. Yarışmaya başla \n"
        + "3. Logout \n"
        + "4. Exit"  );
    }
    
    
    public static void menu(){
    
    while(true){
    
    showMenu();
    Scanner sc = new Scanner(System.in);
        System.out.println("Emeliyyatlardan birini secin: ");
        int emeliyyat = sc.nextInt();
        
        if(emeliyyat==1){
        register();
        }
        
        else if(emeliyyat==3){
        login();
        }
        
        else if(emeliyyat==4){
            System.out.println("Sistemden cixildi");
            System.exit(0);
        
        }
        else if (emeliyyat==2){
        basla();
        }
        
        else{
        
            System.out.println("Secdiyiniz emeliyyat yanlishdir");
        }
    
    }
     }
    
    
    
    public static void register(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Nece telebe qeydiyyat etmek isteyirsiniz?");
       int say = sc.nextInt();
       
      Config.yar = new Yarishmacilar[say];
       
       for(int i=0;i<Config.yar.length;i++){
           System.out.println((i+1)+ ".ci yarishmacini qeydiyyat et : ");
       
         yar[i] = daxiletme();
          
         
           
       }
     System.out.println("Qeydiyyat ugurla tamamlandi"); 
     cap();
    }
    
    
    public static Yarishmacilar daxiletme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adi daxil edin :");
    String ad = sc.nextLine();
        System.out.println("Familyani daxil edin : ");    
        String soyad = sc.nextLine();
        
        Yarishmacilar y = new Yarishmacilar(ad,soyad);
        return y;
    }
    
    
    
    public static void basla(){
    
    Random r = new Random();
    int a = r.nextInt(Config.yar.length);
    cap();
      System.out.println("Necenci ishtirakcinin qazandigini texmin et : ");
   Scanner sc = new Scanner(System.in);
   int texmin = sc.nextInt();
   
   if((a+1)==texmin){
       System.out.println("Tebrikler duz tapdiniz");
       System.out.println("Qazanan : " + Config.yar[a].getFullInfo());
   }
   else{
       System.out.println("Texmininiz yanlishdir");
       System.out.println("Qazanan : " + Config.yar[a].getFullInfo());
   }
    }
    
    public static void cap(){
    for(int i=0;i<Config.yar.length;i++){
    
        System.out.println((i+1)+ "." + (yar[i].getFullInfo()));
    
    }
    
    
    
    }
    
    
    

}