package be.ae.services.repositories;

import be.ae.services.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class AccountRepository {

    @Transactional
    public void saveAccount(Account account){

    }

    public Account getAccountById(String id) {
        return new Account("00");
    }

}
