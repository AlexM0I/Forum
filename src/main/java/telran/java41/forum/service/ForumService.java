package telran.java41.forum.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import telran.java41.forum.dto.AddPostDto;
import telran.java41.forum.dto.PostDto;

public interface ForumService {

	PostDto addPost(String author, AddPostDto addPostDto);
	
	PostDto findePost(String id);
	
	void addLike(String id, String like);
	
	PostDto findePostByAuthor(String author);
	
	PostDto addComment(String id, String comment, String user);
	
	PostDto deletePost(String id);
	
	List<PostDto> findePostByTage(Set<String> tags);
	
	List<PostDto> findePostByPeriod(LocalDate dateFrom, LocalDate dateTo);
	
	PostDto updatePost(String id, String title, Set<String> tags);
}
