package telran.java41.forum.dto;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public class PostDto {
	   String id;
	   String title;
	   String content;
	   String author;
	   @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	   LocalDateTime dateCreated;
	   Set<String> tags;
		int likes;
		Set<CommentDto> comments;
}
