package step5;

public class WrapTest {

	public Object[]	arr = new Object[10];
	public int cnt;
	
	public void add(Object obj) {
		arr[cnt++] = obj;
	}
	
	public void print() {
		int i;
		for (i = 0; i < cnt; i++) {
			Object o = arr[i];
			
			if (o instanceof Integer) {
				System.out.println(((Integer) o).intValue());
			} else if (o instanceof Float) {
				System.out.println(((Float) o).floatValue());
			}
		}
	}
}
