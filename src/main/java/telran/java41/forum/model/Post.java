package telran.java41.forum.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.java41.forum.dto.CommentDto;

@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Post {
	String id;
	@Setter
	String title;
	@Setter
	String content;
	@Setter
	String author;
	@Setter
	int likes = 0;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	LocalDateTime dateCreated;
	Set<String> tags = new HashSet<>();
	Set<CommentDto> comments = new HashSet<>();

	public Post(String id, String title, String content, String author) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.dateCreated = LocalDateTime.now();
	}

	public boolean addComment(CommentDto comment) {
		return comments.add(comment);
	}

	public boolean addTag(String tag) {
		return tags.add(tag);
	}
}
