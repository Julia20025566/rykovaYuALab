package tech.reliab.course.rykovaya.bank.exceptions;

public class CreditExtension extends Exception {
    public CreditExtension(String type, String message) {super(String.format("Ошибка при работе с кредитным счётом. Суть ошибки: %s. Содержимое ошибки: %s",type, message));}
}