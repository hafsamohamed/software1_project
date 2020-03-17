package system.media;


import controller.mediacontroller.PageController;
import system.interaction.Post;
import system.systemusers.Account;

import java.util.Vector;

public class Page {
    private enum pageType{closed, open}
    private String pageName;
    private pageType type;
    private int numOFLikes;
    private Vector<Account> admins;
    private Vector<Account> members;
    private Post post;
    private Account account;
    private PageController pageController;

    Page(){}

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public pageType getType() {
        return type;
    }

    public void setType(pageType type) {
        this.type = type;
    }

    public int getNumOFLikes() {
        return numOFLikes;
    }

    public void setNumOFLikes(int numOFLikes) {
        this.numOFLikes = numOFLikes;
    }
}
