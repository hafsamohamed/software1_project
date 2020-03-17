package controller.accountmanager;

import static org.junit.jupiter.api.Assertions.*;

import com.sun.tools.javac.util.Assert;
import org.junit.Test;
import system.systemusers.Account;
import system.user.User;

class AccountControllerTest {
    @Test
    //Test For Search account
    public void TestForSearch(){


        //Arrange
        Account test = new Account ();
        AccountController Test= new AccountController ();

        //Act
        User result;
        result=test.getUser ();

        org.junit.Assert.assertEquals(Test.getUserName (),result);


    }
    @Test
    //test for craete account
    public void TestForcreateAccount()
    {

        //arrnge
        AccountController Test=new AccountController ();
        Account Tes= new Account();
        //Act
        Assert.checkNonNull(Test.createAccount(Tes.getUser()));
    }

    //test for upgradeRegisteration
    @Test
    public  void TestFORupgradeRegisteration()
    {
        //arrange

    }
}

