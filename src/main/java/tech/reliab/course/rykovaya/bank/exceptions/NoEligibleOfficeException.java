package tech.reliab.course.rykovaya.bank.exceptions;

public class NoEligibleOfficeException extends RuntimeException {
    public NoEligibleOfficeException() {
        super("У выбранного банка нет офисов, удовлетворяющих условиям клиента");
    }
}
