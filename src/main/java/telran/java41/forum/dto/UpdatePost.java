package telran.java41.forum.dto;

import java.util.Set;

import lombok.Getter;

@Getter
public class UpdatePost {
	String title;
	Set<String> tags;
	PostDto post;
}
