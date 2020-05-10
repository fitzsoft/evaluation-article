package com.evaluation.article.hexagonal.evaluation.adapters.config;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;
import com.evaluation.article.hexagonal.evaluation.ports.outgoing.TransferMoneyRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MoneyTransferRepoImpl implements TransferMoneyRepository {
    private Map<String, MobileMoneyTransfer> mTransfer = new HashMap<String, MobileMoneyTransfer>();

    @Override
    public void sendMoney(MobileMoneyTransfer moneyTransfer) {
        mTransfer.put(moneyTransfer.getAmount(), moneyTransfer);
    }

    @Override
    public MobileMoneyTransfer getPhoneNumber(String phone) {
        return mTransfer.get(phone);
    }

    @Override
    public List<MobileMoneyTransfer> getAllTransfers() {
        return getAllTransfers();
    }
}
