public class Chapter071 {
  public static void main(String[] args) {
    String color = "blue";
    switch (color) {
      case "red":
        System.out.println("赤信号です");
        break;
      case "blue":
        System.out.println("青信号です");
        break;
      case "yellow":
        System.out.println("黄信号です");
      default:
        System.out.println("信号の色ではありません");
    }
  }
}