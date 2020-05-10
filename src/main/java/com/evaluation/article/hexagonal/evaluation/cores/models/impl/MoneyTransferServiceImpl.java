package com.evaluation.article.hexagonal.evaluation.cores.models.impl;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;
import com.evaluation.article.hexagonal.evaluation.ports.incoming.SendMoneyService;
import com.evaluation.article.hexagonal.evaluation.ports.outgoing.TransferMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyTransferServiceImpl implements SendMoneyService {
    @Autowired
    private TransferMoneyRepository transferMoneyRepository;

    @Override
    public void sendMoney(MobileMoneyTransfer moneyTransfer) {
        transferMoneyRepository.sendMoney(moneyTransfer);
    }

    @Override
    public MobileMoneyTransfer getPhoneNumber(String phone) {
        return transferMoneyRepository.getPhoneNumber(phone);
    }

    @Override
    public List<MobileMoneyTransfer> getAllTransfers() {
        return transferMoneyRepository.getAllTransfers();
    }
}
