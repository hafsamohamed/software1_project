package system.interaction;

import controller.interactioncontroller.HashtagManager;

import java.sql.Date;

public class Hashtag {
    private String hashtagName;
    private Date hashtagDate;
    private Post post;
    private HashtagManager hashtagManager;

    Hashtag(){}

    public String getHashtagName() {
        return hashtagName;
    }

    public void setHashtagName(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public Date getHashtagDate() {
        return hashtagDate;
    }

    public void setHashtagDate(Date hashtagDate) {
        this.hashtagDate = hashtagDate;
    }

    public Post getPost() {
        return post;
    }
}
