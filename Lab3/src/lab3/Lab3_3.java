/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов
и выведете это количество на экран на отдельной строке.
 */
package lab3;
public class Lab3_3 {
    public static void main(String[] args) {
        int arr[]=new int[15];
        for (int i=0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int col=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0 && (arr[i]!=0))
                col++; 
        }
        System.out.println("Количество четных чисел: "+col);
    }   
}