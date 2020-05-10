package com.evaluation.article.hexagonal.evaluation.web;

import com.evaluation.article.hexagonal.evaluation.cores.models.MobileMoneyTransfer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MoneyTransferRestUI {
    @PostMapping("/send")
    void sendMoney(@RequestBody MobileMoneyTransfer moneyTransfer);

    @GetMapping("/{phoneNumber}")
    MobileMoneyTransfer getPhoneNumber(@PathVariable String phoneNumber);

    @GetMapping
    List<MobileMoneyTransfer> getAllTransfer();


}
