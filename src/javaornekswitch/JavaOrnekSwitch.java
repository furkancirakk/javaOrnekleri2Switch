/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekswitch;

/**
 *
 * @author zajigalka
 */
public class JavaOrnekSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month = 4;
    switch (month){
        case 1:
            System.out.println("Ocak");
            break;
        case 2:
            System.out.println("Şubat");
            break;
        case 3:
            System.out.println("Mart");
            break;
        case 4:
            System.out.println("Nisan");
            break;
        case 5:
            System.out.println("Mayıs");
            break;
        case 6:
            System.out.println("Haziran");
            break;
        case 7:
            System.out.println("Temmuz");
            break;
        case 8:
            System.out.println("Ağustos");
            break;
        case 9:
            System.out.println("Eylül");
            break;
        case 10:
            System.out.println("Ekim");
            break;
        case 11:
            System.out.println("Kasım");
            break;
        case 12:
            System.out.println("Aralık");
            break;
        default:
            System.out.println("Geçersiz giriş.");
    }
    
    int num = 1;
		int evenOdd = num%2;
		if (num>0 && num <11){
		    switch (evenOdd){
		        case 0:
		            System.out.println("Sayı çifttir.");
		            break;
		        case 1:
		            System.out.println("Sayı tektir.");
		            break;
		    }
		}
		else{
		    System.out.println("Lütfen 1 ile 10 arasında bir sayı girin.");
                }
    //soru 1-10 arası olduğu için bu şekilde yazdım yoksa her integer için çalışır:D
		String monthNum = "Ocak";
		switch (monthNum){
		    case "Ocak":
		    System.out.println("1. Ay");
		    break;
		    case "Şubat":
		    System.out.println("2. Ay");
		    break;
		    case "Mart":
		    System.out.println("3. Ay");
		    break;
		    case "Nisan":
		    System.out.println("4. Ay");
		    break;
		    case "Mayıs":
		    System.out.println("5. Ay");
		    break;
		    case "Haziran":
		    System.out.println("6. Ay");
		    break;
		    case "Temmuz":
		    System.out.println("7. Ay");
		    break;
		    case "Ağustos":
		    System.out.println("8. Ay");
		    break;
		    case "Eylül":
		    System.out.println("9. Ay");
		    break;
		    case "Ekim":
		    System.out.println("10. Ay");
		    break;
		    case "Kasım":
		    System.out.println("11. Ay");
		    break;
		    case "Aralık":
		    System.out.println("12. Ay");
		    break;
		    default:
		    System.out.println("Geçersiz giriş.");
		}
    }
    
}
