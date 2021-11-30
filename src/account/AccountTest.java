package account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    Account account2;

    @BeforeEach
    void setUp() {
        //1
        account = new Account("owner", 1234567891011l, 500);
        account2 = new Account("second owner", 3456789101112l, 700);

        account.afegirInteresAnual();
        //provem totes les línies de codi per a saber que funcionen
        account.getBalance();
        account.getAccountNumber();
        System.out.println("Owner Before Each: "+ account.toString());
    }

    @AfterEach
    void tearDown() {
        //1
        System.out.println("Owner After Each: "+ account.toString());
    }

    @Test
    void ingresar() {
        //1
        //ingrés negatiu <0, retorna false
        assertFalse(account.ingresar(-12));
        //ingrés positiu >0, retorna true
        assertTrue(account.ingresar(24));
        //ingrés =0, retorna true
        assertTrue(account.ingresar(0));
    }

    @Test
    void treureDiners() {
        //1
        //la suma de amount i comisio es mes petita que balance, retorna true
        assertTrue(account.treureDiners(200, 150));
        //la suma de amount i comisio es mes gran que balance, retorna false
        assertFalse(account.treureDiners(500, 300));
    }

    @Test
    void transfer(){
        //2
        //la quantitat de balance es superior a la quantitat a transferir, retorna true
        assertTrue(account.transfer(account2, 120));
        //la quantitat de balance es inferior a la quantitat a tranferir, retorna false
        assertFalse(account.transfer(account2, 800));
    }
}