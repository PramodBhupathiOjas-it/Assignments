package java22May;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class AgeCalculator
{
   private static String calculateAge(Date birthDate)
   {
      int years = 0;
      int months = 0;
      int days = 0;
 
      Calendar birthDay = Calendar.getInstance();
      birthDay.setTimeInMillis(birthDate.getTime());
 
      long currentTime = System.currentTimeMillis();
      Calendar now = Calendar.getInstance();
      now.setTimeInMillis(currentTime);
 
      years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
      int currMonth = now.get(Calendar.MONTH) + 1;
      int birthMonth = birthDay.get(Calendar.MONTH) + 1;
 
      months = currMonth - birthMonth;
 
      if (months < 0)
      {
         years--;
         months = 12 - birthMonth + currMonth;
         if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
            months--;
      } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         years--;
         months = 11;
      }
 
      //Calculate the days
      if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
         days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
      else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         int today = now.get(Calendar.DAY_OF_MONTH);
         now.add(Calendar.MONTH, -1);
         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
      } 
      else
      {
         days = 0;
         if (months == 12)
         {
            years++;
            months = 0;
         }
      }
      //Create new Age object 
      return ( years+"."+months);
   }
 
   public static void main(String[] args) throws ParseException
   {
	  Scanner sc =new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("enter date of Birth : ");
      Date  birthDate = sdf.parse(sc.next());     
      String age = calculateAge(birthDate);
      System.out.println(age);
   }
}
