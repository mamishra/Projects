package com.practice.Projects.mayur.questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

  /**
   * In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end
   * tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
   * <p>
   * Given a string of text in a tag-based language, parse this text and retrieve the contents
   * enclosed within sequences of well-organized tags meeting the following criterion:
   * <p>
   * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not
   * valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
   * <p>
   * Tags can be nested, but content between nested tags is considered not valid. For example, in
   * <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
   * <p>
   * Tags can consist of any printable characters.
   * <p>
   * Input Format
   * <p>
   * The first line of input contains a single integer,  (the number of lines). The  subsequent
   * lines each contain a line of text.
   * <p>
   * Constraints
   * <p>
   * Each line contains a maximum of  printable characters. The total number of characters in all
   * test cases will not exceed . Output Format
   * <p>
   * For each line, print the content enclosed within valid tags. If a line contains multiple
   * instances of valid content, print out each instance of valid content on a new line; if no valid
   * content is found, print None.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while (testCases > 0) {
      String line = in.nextLine();

      //Write your code here
      boolean matchFound = false;
      Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
      Matcher m = r.matcher(line);

      while (m.find()) {
        System.out.println(m.group(2));
        matchFound = true;
      }
      if (!matchFound) {
        System.out.println("None");
      }

      testCases--;
    }
  }
}
