package lalli.niit.Dao;

import java.util.List;

import lalli.niit.models.BlogComment;
import lalli.niit.models.BlogPost;
import lalli.niit.models.User;

public interface BlogCommentDao {
void addBlogComment(BlogComment blogComment);
List<BlogComment> getAllBlogComments(int blogPostId);
void updateBlogComment(BlogComment blogComment);
void deleteBlogComment(int commentId);
BlogComment getBlogCommentById(int blogCommentId);
}