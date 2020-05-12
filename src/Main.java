public class Main {

    public static void main(String[] args) {
        converter(String[] args;
        zapolnenieMassiva(String[] args);
        ymnozhenie(String[] args);
        zapolnenieDvymernogoMassiva(String[] args);

    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void converter(String[] args) {
        int[] elements = {1, 0, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < elements.length; i++){
            switch (elements[i]){
                case 0:
                    elements[i] += 1;
                    break;
                case 1:
                    elements[i] -= 1;
                    break;
            }
        }

    }


    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void zapolnenieMassiva(String[] args){
        int[] array = new int[8];

        array[0] = 0;
        array[1] = 3;
        array[2] = 6;
        array[3] = 9;
        array[4] = 12;
        array[5] = 15;
        array[6] = 18;
        array[7] = 21;

        if (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void ymnozhenie(String[] args) {
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array1.length; i++){
            if (array1[i] < 6){
                array1[i] = array1[i] * 2;
            }
            System.out.println(array1);
        }
    }


    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void zapolnenieDvymernogoMassiva(String[] args) {
        int[][] twoArr = new int[3][3];

        twoArr[0][0] = 1;
        twoArr[0][2] = 1;
        twoArr[1][1] = 1;
        twoArr[2][0] = 1;
        twoArr[2][2] = 1;

        for (int i = 0; i < twoArr.length; i++){
            for (int j = 0; j < twoArr.length; j++){
                System.out.print(twoArr[i][j] + "\t");
            }
        }
        System.out.println();
    }
}
