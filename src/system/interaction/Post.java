package system.interaction;

import controller.interactioncontroller.PostManager;
import system.systemusers.Account;

public class Post {
    private enum postType {Public, Private}
    private int postId;
    private postType type;
    private int number_of_likes;
    private int number_of_comments;
    private int number_of_shares;
    private String postContent;
    private Account account;
    private PostManager postManager;

    Post(){}

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public postType getType() {
        return type;
    }

    public void setType(postType type) {
        this.type = type;
    }

    public int getNumber_of_likes() {
        return number_of_likes;
    }

    public void setNumber_of_likes(int number_of_likes) {
        this.number_of_likes = number_of_likes;
    }

    public int getNumber_of_comments() {
        return number_of_comments;
    }

    public void setNumber_of_comments(int number_of_comments) {
        this.number_of_comments = number_of_comments;
    }

    public int getNumber_of_shares() {
        return number_of_shares;
    }

    public void setNumber_of_shares(int number_of_shares) {
        this.number_of_shares = number_of_shares;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
