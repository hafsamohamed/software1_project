package controller.mediacontroller;

import system.media.Page;

import java.util.Vector;

public class PageController {
    private Vector<Page> pages;

    PageController(){}

    public boolean createPage(Page page){
        return true;
    }
    public int updateNumOfLikes(Page page){
        return 1;
    }
    public boolean updateAdmin(Page page){
        return true;
    }

}
