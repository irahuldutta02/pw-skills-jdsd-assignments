public class Question_03 {

  public static void main(String[] args) {
    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 14; j++) {
        if (i == 0 || j == 0 || i == 13 || j == 13) {
          System.out.print("*");
        }
        for(int k =0;k<=j;k++){
            System.out.print("*");
        }
        System.out.println();
      }
    //   for (int j = 5; j >= 0; j--) {
        
    //   }
      System.out.println();
    }
  }
}
