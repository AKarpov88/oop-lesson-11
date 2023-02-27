package com.dmdev.tasks.encapsulation.home;

/**
 * Создать класс, описывающий банкомат.
 *
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 *
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 *
 * Сделать методы для добавления денег в банкомат.
 *
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 *
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат
 * будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные
 * варианты выдачи наличных, чтобы не усложнять алгоритм).
 */

public class Atm {
    private int fiftiesInAtm;
    private int twentiesInAtm;
    private int tensInAtm;

    final int fifty = 50;
    final int twenty = 20;
    final int ten = 10;

    public Atm(int fiftiesInAtm, int twentiesInAtm, int tensInAtm) {
        this.fiftiesInAtm = fiftiesInAtm;
        this.twentiesInAtm = twentiesInAtm;
        this.tensInAtm = tensInAtm;
    }

    public void setFifties(int fifties) {
        this.fiftiesInAtm = fifties;
    }
    public void setTwenties(int twenties) {
        this.twentiesInAtm = twenties;
    }
    public void setTens(int tens) {
        this.tensInAtm = tens;
    }

    public boolean withdrawCash(int sum) {
          int atmSum = (fiftiesInAtm * fifty) + (twentiesInAtm * twenty) + (tensInAtm * ten);
        if (atmSum < sum) {
            System.out.println("Невозможно выполнить операцию. Выберите меньшую сумму");
            return false;
        } else if (sum % 10 != 0) {
            System.out.println("Введенная сумма должна быть кратна 10");
            return false;
        } else {
            int fiftiesInSum = sum / fifty; // Подсчет сколько нужно 50-к
            int fiftiesInWithdrawal = 0; // Переменная показывает сколько в итоге будет выдано 50-к
            if (fiftiesInSum > 0 && fiftiesInAtm > 0) {
                if (fiftiesInAtm > fiftiesInSum) { // Ситуация, когда в банкомате больше, чем требуется
                    fiftiesInAtm -= fiftiesInSum; // Уменьшаем количество 50-к в банкомате на количество нужных нам
                    sum -= fiftiesInSum * fifty; // Корректируем сумму выдачи
                    fiftiesInWithdrawal = fiftiesInSum; // Количество выданных 50-к
                } else if (fiftiesInAtm == fiftiesInSum) {
                    fiftiesInAtm = 0;
                    sum -= fiftiesInSum * fifty;
                    fiftiesInWithdrawal = fiftiesInSum;
                } else {
                    sum -= fiftiesInAtm * fifty;
                    fiftiesInWithdrawal = fiftiesInAtm;
                    fiftiesInAtm = 0;
                }
            }

            int twentiesInSum = sum / twenty;
            int twentiesInWithdrawal = 0;
            if (twentiesInSum > 0 && twentiesInAtm > 0) {
                if (twentiesInAtm > twentiesInSum) {
                    twentiesInAtm -= twentiesInSum;
                    sum -= twentiesInSum * twenty;
                    twentiesInWithdrawal = twentiesInSum;
                } else if (twentiesInAtm == twentiesInSum) {
                    twentiesInAtm = 0;
                    sum -= twentiesInSum * twenty;
                    twentiesInWithdrawal = twentiesInSum;
                } else {
                    sum -= twentiesInAtm * twenty;
                    twentiesInWithdrawal = twentiesInAtm;
                    twentiesInAtm = 0;
                }
            }

            int tensInSum = sum / ten;
            int tensInWithdrawal = 0;
            if (tensInSum > 0 && tensInAtm > 0) {
                if (tensInAtm > tensInSum) {
                    tensInAtm -= tensInSum;
                    sum -= tensInSum * ten;
                    tensInWithdrawal = tensInSum;
                } else if (tensInAtm == tensInSum) {
                    tensInAtm = 0;
                    sum -= tensInSum * ten;
                    tensInWithdrawal = tensInSum;
                } else {
                    sum -= tensInAtm * ten;
                    tensInWithdrawal = tensInAtm;
                    tensInAtm = 0;
                }
            }

            System.out.println("Банкнот номиналом 50: " + fiftiesInWithdrawal);
            System.out.println("Банкнот номиналом 20: " + twentiesInWithdrawal);
            System.out.println("Банкнот номиналом 10: " + tensInWithdrawal);
        }
        return true;
    }
}
