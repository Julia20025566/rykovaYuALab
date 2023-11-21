package tech.reliab.course.rykovaya.bank.exceptions;

public class NoEligibleAtmException extends RuntimeException {
    public NoEligibleAtmException() {
        super("В выбранном офисе нет банкоматов, удовлетворяющих условиям клиента");
    }
}
