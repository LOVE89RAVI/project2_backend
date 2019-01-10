package lalli.niit.Dao;



import lalli.niit.models.BlogPost;
import lalli.niit.models.BlogPostLikes;


public interface BlogPostLikesDao
{
BlogPostLikes hasUserLikedBlogPost(int blogPostId,String email);//email is loggedin user's email id

BlogPost updateLikes(int blogPostId, String email);
}