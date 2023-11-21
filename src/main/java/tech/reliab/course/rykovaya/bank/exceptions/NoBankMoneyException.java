package tech.reliab.course.rykovaya.bank.exceptions;

public class NoBankMoneyException extends RuntimeException {
    public NoBankMoneyException() {
        super("В банке недостаточно средств для выдачи кредита");
    }
}
