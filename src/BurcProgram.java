import java.util.Scanner;


public class BurcProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğum tarihinizin gün olarak giriniz");

        int day = input.nextInt();

        System.out.println("Lütfen doğum tarihinizin ayını giriniz ");

        String month = input.next();


        if((day>=21 && day <=31) && (month.equals("mart") ) || (( day>=1 && day <=20) && (month.equals("nisan") )))
        {

            System.out.println("Koç Burcu");}

        else if((day>=21 && day <=31) && (month.equals("nisan") ) || ( (day>=1 && day <=21) && (month.equals("mayıs")) ))
        {

            System.out.println("Boğa Burcu ");}

        else if((day>=22 && day <=31 && month.equals("mayıs") ) || (( day>=1 && day <=22) && (month.equals("haziran") )))
        {

            System.out.println("İkizler Burcu ");}

        else if((day>=23 && day <=31 && month.equals("haziran") ) || ( (day>=1 && day <=22) && (month.equals("temmuz") )))
        {

            System.out.println("Yengeç Burcu");}

        else if((day>=23 && day <=31 && month.equals("temmuz") ) || ( (day>=1 && day <=22 && month.equals("ağustos") )))
        {

            System.out.println("Aslan Burcu");}

        else if((day>=23 && day <=31 && month.equals("ağustos") ) || (( day>=1 && day <=22 && month.equals("eylül") )))
        {

            System.out.println("başak Burcu");}

        else if((day>=23 && day <=31 && month.equals("eylül") ) || (( day>=1 && day <=22 && month.equals("ekim") )))
        {

            System.out.println("terazi Burcu");}

        else if((day>=23 && day <=31 && month.equals("ekim") ) || (( day>=1 && day <=21 && month.equals("kasım") )))
        {

            System.out.println("akrep Burcu");}

        else if((day>=22 && day <=31 && month.equals("kasım") ) || (( day>=1 && day <=21 && month.equals("aralık") )))
        {

            System.out.println("yay Burcu");}

        else if((day>=22 && day <=31 && month.equals("aralık") ) || (( day>=1 && day <=21 && month.equals("ocak") )))
        {

            System.out.println("oğlak Burcu");}

        else if((day>=22 && day <=31 && month.equals("ocak") ) || (( day>=1 && day <=19 && month.equals("şubat") )))
        {

            System.out.println("terazi Burcu");}

        else if((day>=20 && day <=31 && month.equals("şubat") ) || (( day>=1 && day <=20 && month.equals("mart")  )))
        {

            System.out.println("balık Burcu");}




    }
}


