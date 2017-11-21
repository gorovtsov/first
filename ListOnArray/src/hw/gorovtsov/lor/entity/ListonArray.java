package hw.gorovtsov.lor.entity;

public class ListonArray {
	private Object[] ar; // array that contains data
	private int length;

	public ListonArray() {
	}

	public void add(Object ob) {
		int addIndex = this.length;
		if (isFull()) {
			extendAr();
		}

		ar[addIndex] = ob;
		this.length++;
	}

	public Object getElem(int index) {
		if (index >= this.length || index < 0) {
			System.out.print("No such element");
		}

		return ar[index];
	}

	private int extendAr() {
		Object[] extendedAr = new Object[this.ar.length + 10];
		int availableIndex = 0;
		for (int i = 0; i < this.ar.length; i++) {
			extendedAr[i] = this.ar[i];
			availableIndex = i;
		}
		this.ar = extendedAr;
		return availableIndex; //
	}

	private boolean isFull() {
		if (this.ar[ar.length - 1] != null) {
			return true;
		}
		return false;
	}

	/*
	 * public T getElement(int i){ return (T)ar[i]; }
	 */
}
