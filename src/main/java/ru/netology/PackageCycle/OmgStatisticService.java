package ru.netology.PackageCycle;

public class OmgStatisticService { // открыли скобку для миллиона методов

    public long totalSum(long [] someNumbersMassive){ // открыли метод 1
        long sum = 0; // 0 потому что нужно же к чему-то прибавлять
        for (long variable : someNumbersMassive) { // начали описывать код для цикла
          sum = sum + variable;
        } // закончили описывать код для цикла
        return sum;
    } // закрыли метод 1




    public long medium(long [] someNumbersMassive) { // открыли метод 2
        long summa = 0; // 0 потому что нужно же к чему-то прибавлять
        long medium = 0;
        for (long variable : someNumbersMassive) { // начали описывать код для цикла
            summa = summa + variable;
            medium = summa / someNumbersMassive.length;
        } // закончили описывать код для цикла
        return medium;
    } // закрыли метод 2






    public long numberOfLastMax(long [] someNumbersMassive) { // открыли метод 3
        long potentialMax = someNumbersMassive [0]; // (для расчетов) 0 потому что возьмем пока за максимум 1е зачение в массиве
        long ordinalNumber = 0; // (для нумерации) начинаем нумеровать элементы с нуля
        long monthWithMax = 0; // (для вывода номера с максимумом) объявили как нечто со зачением шоб було что ретурнить
        for (long variable : someNumbersMassive) {// начали описывать код для цикла
           if (variable >= potentialMax) { // "=" дает возможность записать последний макс. элемент
                potentialMax = variable;
                monthWithMax = ordinalNumber; // если пробежка выявила последний макс, то в month запихнуть ordinal
              }
           ordinalNumber = ordinalNumber+1; // подсчет ведется за пределами ифа
        } // закончили описывать код для цикла
        return monthWithMax;
    } // закрыли метод 3


    public long numberOfLastMin(long [] someNumbersMassive) { // открыли метод 4
        long potentialMin = someNumbersMassive [0]; // (для расчетов) 0 потому что возьмем пока за минимум 1е зачение в массиве
        long ordinalNumber = 0; // (для нумерации) начинаем нумеровать элементы с нуля
        long monthWithMin = 0; // (для вывода номера с максимумом) объявили как нечто со зачением шоб було что ретурнить
        for (long variable : someNumbersMassive) {// начали описывать код для цикла
            if (variable <= potentialMin) { // "=" дает возможность записать последний мин. элемент
                potentialMin = variable;
                monthWithMin = ordinalNumber; // если пробежка выявила последний min, то в month запихнуть ordinal
            }
            ordinalNumber = ordinalNumber+1; // подсчет ведется за пределами ифа
        } // закончили описывать код для цикла
        return monthWithMin;
    } // закрыли метод 4


//количество месяцев в которых продажи были ниже среднего
public long lessThenMedium(long[]someNumbersMassive) {
    long medium = medium(someNumbersMassive); // объявить, что среднее считается согласно 2 методу
    long counter = 0; // заведем счетчик для вычисления месяцев

      for (long variable : someNumbersMassive) {
            if (variable < medium) { // если переменная из массива меньше среднего
            counter = counter + 1; // то к счетчику прибавляется единица
            } // закончили иф
            } // закончили цикл
    return counter; // вернуть набежавшие единицы счетчика
}



    //количество месяцев в которых продажи были ниже среднего (Full)
    public long lessThenMediumFull(long[]someNumbersMassive) {
        long sum = 0; // объявить, что сумма пока неизвестна
        long medium = 0; // объявить, что среднее пока неизвестно
        long counter = 0; // заведем счетчик для вычисления месяцев

        for (long variable : someNumbersMassive) { // начали описывать код для цикла, вычисляющего сумму
            sum = sum + variable;
            }

        medium = sum / someNumbersMassive.length; // просто отдельно нашли среднее

        for (long variable : someNumbersMassive) { // нацали описывать код для цикла, проводящего сранвение и инкрементирующего
            if (variable < medium) { // если переменная из массива меньше среднего
                counter = counter + 1; // то к счетчику прибавляется единица
            } // закончили иф
        } // закончили цикл
        return counter; // вернуть набежавшие единицы счетчика
    }


    //количество месяцев в которых продажи были выше среднего
    public long moreThenMedium(long[]someNumbersMassive) {
        long medium = medium(someNumbersMassive); // объявить, что среднее считается согласно 2 методу
        long counter = 0; // заведем счетчик для вычисления месяцев

        for (long variable : someNumbersMassive) {
            if (variable > medium) { // если переменная из массива меньше среднего
                counter = counter + 1; // то к счетчику прибавляется единица
            } // закончили иф
        } // закончили цикл
        return counter; // вернуть набежавшие единицы счетчика
    }

} // закрыли скобкой миллион методов
