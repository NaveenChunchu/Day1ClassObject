
public class Post {
	
	private String postname;
	private int likes;
	private int comments;
	
	public Post() {
		
	}
public Post(String postname, int likes, int comments) {
		super();
		this.postname = postname;
		this.likes = likes;
		this.comments = comments;
	}
	public String getpostname() {
		return postname;
	}
	public void setpostname(String postname) {
		this.postname = postname;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}


	
}
