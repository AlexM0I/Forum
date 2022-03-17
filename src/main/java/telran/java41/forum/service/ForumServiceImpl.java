package telran.java41.forum.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import telran.java41.forum.dao.ForumRepository;
import telran.java41.forum.dto.AddPostDto;
import telran.java41.forum.dto.PostDto;

@Service
public class ForumServiceImpl implements ForumService {
	
	ForumRepository forumRepository;
	ModelMapper modelMapper;

	@Override
	public PostDto addPost(String author, AddPostDto addPostDto) {
		
		return null;
	}

	@Override
	public PostDto findePost(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLike(String id, String like) {
		// TODO Auto-generated method stub

	}

	@Override
	public PostDto findePostByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto addComment(String id, String comment, String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto deletePost(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> findePostByTage(Set<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> findePostByPeriod(LocalDate dateFrom, LocalDate dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto updatePost(String id, String title, Set<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

}
