package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	T[] tArray;

	public ArrayList() {
		tArray = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		try {
			return tArray[loc];
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public void add(T val) {
		T[] temp = (T[]) new Object[tArray.length + 1];
		temp[tArray.length] = val;
		for (int i = 0; i < tArray.length; i++) {
			temp[i] = tArray[i];
		}
		tArray = temp;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[tArray.length + 1];
		//temp[tArray.length] = val;
		try {
			for (int i = 0; i < temp.length; i++) {
				if(i < loc) {
					 
				}
			}
			tArray = temp;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[tArray.length + 1];
		//temp[tArray.length] = val;
		try {

			for (int i = 0; i < tArray.length; i++) {
				if (i == loc) {
					temp[loc] = val;
				} else {
					temp[i] = tArray[i];
				}
			}
			tArray = temp;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		try {

			T[] temp = (T[]) new Object[tArray.length + 1];
			for (int i = 0; i < tArray.length; i++) {
				if (i == loc) {
					i++;
				}
				temp[i] = tArray[i];
			}
			tArray = temp;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean contains(T val) {
		for (int i = 0; i < tArray.length; i++) {
			if (tArray[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return tArray.length;
	}
}