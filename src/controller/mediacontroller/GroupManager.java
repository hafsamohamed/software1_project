package controller.mediacontroller;

import system.media.Group;

import java.util.Vector;

public class GroupManager {
    private Vector<Group> groups;

    GroupManager(){}
    public boolean createGroup(Group group){
        return true;
    }

    public int updateNumOfLikes(Group group){
        return 1;
    }

    public boolean updateAdmin(Group group){
        return true;
    }

}
