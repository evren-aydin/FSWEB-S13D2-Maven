package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(-5));
        System.out.println(numberToWords(123));


    }
    public static boolean isPalindrome(int sayi){
        sayi=Math.abs(sayi);
        String sayiStr= String.valueOf(sayi);
        // stringBuilder kullanarak değiştirilemez bir string nesnesini değiştirilebilir hale getiriyoruz
        //daha sonra onu toString kullanarak, nesnenin insan tarafından okunabilir bir string temsili haline getiriyoruz
        String sayiTersi= new StringBuilder(sayiStr).reverse().toString();

        return sayiStr.equals(sayiTersi);
    }
    public static boolean isPerfectNumber(int num){
       if(num<0){
           return false;
       }
       int sum=0;
       for(int i=1; i<num;i++){
           if(num%i==0){
               sum+=i;
           }
       }
       return sum==num;

    }

    public static String numberToWords(int number){
      if(number<0){
          return "Invalid Value";
      }

      char[] dizi= String.valueOf(number).toCharArray();
        StringBuilder result = new StringBuilder();
      for(char digit:dizi){
          switch (digit){
              case '0':
                  result.append("Zero ");
                  break;
              case '1':
                  result.append("One ");
                  break;
              case '2':
                  result.append("Two ");
                  break;
              case '3':
                  result.append("Three ");
                  break;
              case '4':
                  result.append("Four ");
                  break;
              case '5':
                  result.append("Five ");
                  break;
              case '6':
                  result.append("Six ");
                  break;
              case '7':
                  result.append("Seven ");
                  break;
              case '8':
                  result.append("Eight ");
                  break;
              case '9':
                  result.append("Nine ");
                  break;
          }
      }
        return result.toString().trim();
    }

}
