package com.evaluation.article.hexagonal.evaluation.adapters.controllers;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;
import com.evaluation.article.hexagonal.evaluation.ports.incoming.SendMoneyService;
import com.evaluation.article.hexagonal.evaluation.web.MoneyTransferRestUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MoneyTransferController implements MoneyTransferRestUI {

    @Autowired
    private SendMoneyService sendMoneyService;

    @Override
    public void sendMoney(MobileMoneyTransfer moneyTransfer) {
        sendMoneyService.sendMoney(moneyTransfer);
    }

    @Override
    public MobileMoneyTransfer getPhoneNumber(String phoneNumber) {
        return sendMoneyService.getPhoneNumber(phoneNumber);
    }

    @Override
    public List<MobileMoneyTransfer> getAllTransfer() {
        return sendMoneyService.getAllTransfers();
    }
}
