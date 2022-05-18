
public class Instapost {

	public static void main(String[] args) {
	
		Post p = new Post("jhon",50,30);
		
		// Based actual data 
		System.out.println("Post name: "+p.getpostname());
		System.out.println("No.of Likes: "+p.getLikes());
		System.out.println("No.of Comments: "+p.getComments());
		System.out.println("==============");
		
		p.setpostname("bob");
		p.setComments(34); //  changing the no.of likes
		p.setLikes(12);
		System.out.println("After Changin the data....");
		System.out.println("Post name: "+p.getpostname());
		System.out.println("No.of Likes: "+p.getLikes());
		System.out.println("No.of Comments: "+p.getComments());
		
		
	}

}
