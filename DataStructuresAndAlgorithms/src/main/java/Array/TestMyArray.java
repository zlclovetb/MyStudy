package Array;

/**
 * @program: MyStudy
 * @description:
 * @author: Mr.Zhang
 * @create: 2021-05-14 14:37
 **/
public class TestMyArray {
  public static void main(String[] args) {
    /*MyArray<Integer> myArray = new MyArray<Integer>();
    myArray.add(10);
    myArray.add(87);
    myArray.add(32);
    myArray.add(16);
    myArray.add(56);

    myArray.printArray();*/

    MyArray<String> strArray = new MyArray<String>();
    strArray.add("aaa");
    strArray.add("bb");
    strArray.add("cc");
    strArray.add("dd");
    strArray.add("ee");

    strArray.printArray();
    //strArray.delete(1);
    strArray.update(1, "bbbbbbbbbbbbbbbbb");
    strArray.printArray();
    //System.out.println(strArray.find(8));
  }
}
