package system.media;

import controller.mediacontroller.GroupManager;
import system.systemusers.Account;

import java.util.Vector;

public class Group {
    enum groupType{closed, open}
    private String groupName;
    private groupType type;
    private Vector<Account> admins;
    private Vector<Account> members;
    GroupManager manager;

    Group(){}

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public groupType getType() {
        return type;
    }

    public void setType(groupType type) {
        this.type = type;
    }
}
