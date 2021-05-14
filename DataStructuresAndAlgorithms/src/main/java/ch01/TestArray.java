package ch01;

/**
 * @program: MyStudy
 * @description:
 * @author: Mr.Zhang
 * @create: 2021-05-12 11:23
 **/
public class TestArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 5, 6};
    System.out.println(array[0]);

    int[] array1 = new int[]{2, 3, 5};
    System.out.println(array1[0]);

    int[] array2 = new int[3];
    array2[0] = 1;
    array2[1] = 5;
    array2[2] = 6;
    System.out.println(array2[2]);
  }
}
