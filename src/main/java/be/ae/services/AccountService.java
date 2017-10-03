package be.ae.services;

import be.ae.rest.model.Account;
import be.ae.services.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public String getDummy() {
        return "dummy_string";
    }

    public List<Account> getAccounts(){
        return null;
    }

    public void createAccount(Account newAccount){

    }

    public Account getAccountById(String id) {
        be.ae.services.model.Account account = accountRepository.getAccountById(id);
        return null;
    }

    public void deleteAccountById(String id) {

    }
}
