class test11 {
  public static void main(String[] args) {
    String school = "HAMAMATSU TECHNICAL HIGH SCHOOL";
    int i = 0;
    // for(i = 0; i < school.length(); i++) {
    // System.out.println(school.substring(i, i + 1));
    // }

    while (i < school.length()) {
      System.out.println(school.substring(i, i + 1));
      i++;
    }

    // while (i < school.length()) {
    // System.out.println(school.charAt(i));
    // i++;
    // }
  }
}
