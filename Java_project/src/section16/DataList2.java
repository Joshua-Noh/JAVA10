package section16;
// Generic 사용
public class DataList2<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList2() {
		data = new Object[defaultSize];
	}
	
	public DataList2(int size) {
		data = new Object[size];
	}
	
	public void add(T value) {
		data[size++] = value;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public int size() {
		return size;
	}
}