package thread;

public class MyString {
	private Integer num = 0;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	public synchronized void append(Integer num) {
		this.num = this.num + num;
	}
	
}
