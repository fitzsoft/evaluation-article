package com.evaluation.article.hexagonal.evaluation.ports.outgoing;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;

import java.util.List;

public interface TransferMoneyRepository {

    void sendMoney(MobileMoneyTransfer moneyTransfer);

    MobileMoneyTransfer getPhoneNumber(String phone);

    List<MobileMoneyTransfer> getAllTransfers();
}
