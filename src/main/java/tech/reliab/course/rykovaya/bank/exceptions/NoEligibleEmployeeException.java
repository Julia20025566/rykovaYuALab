package tech.reliab.course.rykovaya.bank.exceptions;

public class NoEligibleEmployeeException extends RuntimeException {
    public NoEligibleEmployeeException() {
        super("В выбранном офисе нет сотрудников, умеющих выдавать кредиты");
    }
}