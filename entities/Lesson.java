package package11_OrientacaoObjeto3.challenge.entities;

public abstract class Lesson {

	private String title;
	
	public Lesson() {
	}

	public Lesson(String title) {
		this.title = title;
	}
	
	public abstract int duration();
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
