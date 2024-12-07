package interviews;

public class Message {
	public Message(int id, int likes) {
		this.id = id;
		this.likes = likes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	private int id;
	private int likes;

}
