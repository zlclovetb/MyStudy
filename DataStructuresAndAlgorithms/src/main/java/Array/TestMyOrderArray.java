package Array;

/**
 * @program: MyStudy
 * @description:
 * @author: Mr.Zhang
 * @create: 2021-05-14 17:31
 **/
public class TestMyOrderArray {

  public static void main(String[] args) {
    MyOrderArray<String> strArray = new MyOrderArray<String>();
    strArray.add("aaa");
    strArray.add("ddd");
    strArray.printArray();
    System.out.println("-------------------------");
    strArray.add("ccc");
    strArray.printArray();
    System.out.println("-------------------------");
    strArray.add("eee");
    strArray.printArray();
    System.out.println("-------------------------");
    strArray.add("bbb");

    strArray.printArray();
  }

}
