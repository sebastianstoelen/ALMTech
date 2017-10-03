
package be.ae.rest;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import be.ae.services.AccountService;
import be.ae.rest.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 * No description
 * (Generated with springmvc-raml-parser v.0.10.2)
 * 
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;


    /**
     * Get list of accounts
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Account>> getAccounts() {

        return ResponseEntity.ok(accountService.getAccounts());
    }

    /**
     * Create new account
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createAccount(
        @Valid
        @RequestBody
        be.ae.rest.model.Account account) {

        accountService.createAccount(account);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(accountService.getDummy()).toUri();

        return ResponseEntity.created(location).build();
    }

    /**
     * Retrieve account details
     * 
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public be.ae.rest.model.Account getAccountById(
        @PathVariable
        String accountId) {
        accountService.getAccountById(accountId);
        return null;
    }

    /**
     * Delete account
     * 
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAccountById(
        @PathVariable
        String accountId) {
        accountService.deleteAccountById(accountId);
        return null;
    }

}
