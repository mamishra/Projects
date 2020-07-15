package com.practice.Projects.mayur.questions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class GetDayCalendar {


  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = findDay(month, day, year);
    System.out.println(res);
    //bufferedWriter.write(res);
    //bufferedWriter.newLine();

    bufferedReader.close();
    //bufferedWriter.close();
  }

  private static String findDay(int month, int day, int year) {
    Calendar calendar = new Calendar.Builder().setDate(year, month-1, day).build();
    int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
    String result;
    switch (weekDay) {
      case 1: result = "SUNDAY";
      break;
      case 2: result = "MONDAY";
      break;
      case 3: result = "TUESDAY";
      break;
      case 4: result = "WEDNESDAY";
      break;
      case 5: result = "THURSDAY";
      break;
      case 6: result = "FRIDAY";
      break;
      case 7: result = "SATURDAY";
      break;
      default: result = "INVALID_INPUT";
    }
    return result;
  }

}
