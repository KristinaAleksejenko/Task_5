/*
Отсортировать по возрастанию зубчатый массив из 5 строк с 3, 5, 7, 8, 9 - тью ячейками. 
Заполнить его случайными числами от 50 до 100 и отсортировать. 
Вывести в консоль массив несортированный и сортированный. 
Загрузить код проекта на удаленный репозиторий Git.
 */
package task5;



import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Random random=new Random();
       int[][] jaggedArray = new int [5][]; // создаем зубчатый массив от 0 до 5
       jaggedArray[0] = new int[3];
       jaggedArray[1] = new int[5];
       jaggedArray[2] = new int[7];
       jaggedArray[3] = new int[8];
       jaggedArray[4] = new int[9];
       System.out.println("Массив забчатый");
       for(int i=0; i< jaggedArray.length; i++) { // цикл фор для работы с данными массива
       //счетчик цикла начинается с нуля, с заданною длиною выше,с шагом +1 // перебирает столбцы
         for (int j = 0; j<jaggedArray[i].length; j++) { // перебирает строки рандомно от 50 до 100
                jaggedArray[i][j] = random.nextInt(100-50);
            }
        }
        
        for (int i=0; i<jaggedArray.length; i++) {
            for (int j = 0; j<jaggedArray[i].length; j++) {
                for(int k=0; k<jaggedArray.length; k++){
                    for(int m=0; m<jaggedArray[k].length; m++){
                        if(jaggedArray[i][j]<jaggedArray[k][m]){
                            jaggedArray[i][j]=jaggedArray[i][j]+jaggedArray[k][m];
                            jaggedArray[k][m]=jaggedArray[i][j]-jaggedArray[k][m];
                            jaggedArray[i][j]=jaggedArray[i][j]-jaggedArray[k][m]; // сортировка
                        }
                        
                    }
                }
            }
        }
        for (int i=0; i<jaggedArray.length; i++) {
            for (int j = 0; j<jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); //вывести массив 
        }
        
    }


    
}


    


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
