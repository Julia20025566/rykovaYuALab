package tech.reliab.course.rykovaya.bank.exceptions;

public class EmployeeException extends  Exception {
    public EmployeeException(String type, String message) {super(String.format("Ошибка при работе с сотрудником банка. Суть ошибки: %s. Содержимое ошибки: %s",type, message));}
}
