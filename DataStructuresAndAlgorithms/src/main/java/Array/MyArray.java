package Array;

/**
 * @program: MyStudy
 * @description:
 * @author: Mr.Zhang
 * @create: 2021-05-14 14:24
 **/
public class MyArray<T> {
  private Object[] array = null;
  private int effectEleLen = 0;

  public MyArray(){
    array = new Object[30];
  }

  public MyArray(int arrayLen){
    array = new Object[arrayLen];
  }

  public void add(T value){
    if(effectEleLen == array.length){
      System.out.println("当前数组已达到最大值，不再支持插入数据");
      return;
    }
    array[effectEleLen] = value;
    effectEleLen++;
  }

  public T find(int index) {
    if(index < 0 || index > effectEleLen){
      throw new ArrayIndexOutOfBoundsException("索引超出当前数组的有效长度");
    } else {
      return (T) array[index];
    }
  }

  public void delete(int index) {
    if (index < 0 || index > effectEleLen) {
      throw new ArrayIndexOutOfBoundsException("索引超出当前数组的有效长度");
    } else {
      for (int i = index; i < effectEleLen; i++) {
        array[i] = array[i + 1];
      }
      effectEleLen--;
    }
  }

  public void update(int index, T value) {
    if (index < 0 || index > effectEleLen) {
      throw new ArrayIndexOutOfBoundsException("索引超出当前数组的有效长度");
    } else {
      array[index] = value;
    }
  }

  public void printArray() {
    for (int i = 0; i < effectEleLen; i++) {
      System.out.println(array[i].toString());
    }
  }

}
