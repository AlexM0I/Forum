package telran.java41.forum.dto;

import java.util.Set;

import lombok.Getter;

@Getter
public class AddPostDto {
	String title;
	String content;
	Set<String> tags;
	PostDto post;
}
