package Array;

import java.util.stream.Stream;

/**
 * @program: MyStudy
 * @description:
 * @author: Mr.Zhang
 * @create: 2021-05-12 11:23
 **/
public class TestArray {
  public static void main(String[] args) {
    //普通数组及初使经的三种方式及遍历、访问
    //方式1:
    int[] array = {1, 2, 5, 6};
    System.out.println(array[0]);

    //方式2:
    int[] array1 = new int[]{2, 3, 5};
    System.out.println(array1[0]);

    //方式3:
    String[] array2 = new String[3];
    array2[0] = "1";
    array2[1] = "5";
    array2[2] = "6";
    System.out.println(array2[2]);

    //遍历访问nt
    for (String i : array2) {
      System.out.println(i);
    }
    for(int i=0; i< array2.length; i++){
      System.out.println(array2[i]);
    }
    //jdk8
    Stream.of(array2).forEach(System.out::println);

    //二维数组
    int[][] array3 = {{1, 2, 5, 6}, {11,2}};
    System.out.println(array3[1][1]);

    int[][] array4 = new int[][]{{1, 2, 5, 6}, {22,33 }};
    System.out.println(array4[1][1]);

    int[][] array5 = new int[3][3];
    array5[0] = new int[]{1, 2, 5};
    array5[1] = new int[]{1, 2, 5};;
    array5[2] = new int[]{1, 2, 5};;
    System.out.println(array5[2][2]);
  }
}
