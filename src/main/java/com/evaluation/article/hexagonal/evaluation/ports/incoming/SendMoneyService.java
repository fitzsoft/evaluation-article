package com.evaluation.article.hexagonal.evaluation.ports.incoming;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;

import java.util.List;


public interface SendMoneyService {

    void sendMoney(MobileMoneyTransfer moneyTransfer);

    MobileMoneyTransfer getPhoneNumber(String phone);

    List<MobileMoneyTransfer> getAllTransfers();

}
