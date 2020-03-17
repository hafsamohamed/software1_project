package controller.interactioncontroller;

import system.interaction.Post;

import java.util.Vector;

public class PostManager {
    private Vector<Post> posts;

    PostManager(){}
    public boolean createPost(Post post){
        return true;
    }

    public boolean editPost(Post post){
        return true;
    }

    public int updateNumOfLikes(Post post){
        return 1;
    }

    public int updateNumOfComments(Post post){
        return 1;
    }

    public int updateNumOfShares(Post post){
        return 1;
    }






}
