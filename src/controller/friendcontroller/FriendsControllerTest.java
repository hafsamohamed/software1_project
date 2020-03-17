package controller.friendcontroller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import system.systemusers.Account;

import java.util.Vector;

public class FriendsControllerTest {


    @Test
    public void TestRequest()
    {

        //Arrange
        //act



    }
    @Test
    public  void TestacceptFriendRequest(){
        Vector<Account>Acc = new Vector<>();
        int result = Acc.size ()+1;
        //if User accept Request friend number of friendes wii increase
        //act
        org.junit.Assert.assertEquals(Acc.size (),result);






    }

}