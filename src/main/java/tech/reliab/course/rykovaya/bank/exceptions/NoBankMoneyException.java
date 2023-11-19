package tech.reliab.course.rykovaya.bank.exceptions;

public class NoBankMoneyException extends Exception {
    public NoBankMoneyException() {
        super("В банке недостаточно средств для выдачи кредита");
    }
}