package tech.reliab.course.rykovaya.bank.exceptions;

public class BankAtmException extends Exception {
    public BankAtmException(String type, String message) {super(String.format("Ошибка при работе с банкоматом. Суть ошибки: %s. Содержимое ошибки: %s",type, message));}
}