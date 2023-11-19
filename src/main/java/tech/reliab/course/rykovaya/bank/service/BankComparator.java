package tech.reliab.course.rykovaya.bank.service;

import tech.reliab.course.rykovaya.bank.entity.Bank;

import java.util.Comparator;

public interface BankComparator extends Comparator<Bank> {
    @Override
    int compare(Bank o1, Bank o2);

}