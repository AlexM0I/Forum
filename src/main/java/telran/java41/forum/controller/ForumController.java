package telran.java41.forum.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.java41.forum.dto.AddPostDto;
import telran.java41.forum.dto.PostDto;
import telran.java41.forum.service.ForumService;

@RestController
public class ForumController {

	ForumService forumService;

	@PostMapping("/forum/post/{autor}")
	public PostDto addPost(@PathVariable String autor, @RequestBody AddPostDto addPostDto) {
		return forumService.addPost(autor, addPostDto);
	}

	@GetMapping("/forum/post/{id}")
	public PostDto findePost(@PathVariable String id) {
		return forumService.findePost(id);
	}

	@PutMapping("/forum/post/{id}/{like}")
	public void addLike(@PathVariable String id, @PathVariable String like) {
		forumService.addLike(id, like);
	}

	@GetMapping("/forum/post/author/{author}")
	public PostDto findePostByAuthor(@PathVariable String author) {
		return forumService.findePostByAuthor(author);
	}

	@PutMapping("/forum/post/{id}/comment/{user}")
	public PostDto addComment(@PathVariable String id, @RequestBody String comment, @PathVariable String user) {
		return forumService.addComment(id, comment, user);
	}

	@DeleteMapping("/forum/post/{id}")
	public PostDto deletePost(@PathVariable String id) {
		return forumService.deletePost(id);
	}

	@PostMapping("/forum/post/tags")
	public List<PostDto> findePostByTage(@RequestBody Set<String> tags) {
		return forumService.findePostByTage(tags);
	}

	@PostMapping("/forum/post/period")
	public List<PostDto> findePostByPeriod(@RequestBody LocalDate dateFrom, @RequestBody LocalDate dateTo) {
		return findePostByPeriod(dateFrom, dateTo);
	}

	@PutMapping("/forum/post/{id}")
	public PostDto updatePost(@PathVariable String id, @RequestBody String title, @RequestBody Set<String> tags) {
		return forumService.updatePost(id, title, tags);
	}

}
