package hw.gorovtsov.list.onarray;

public class ListOnArray<T extends Object> {
	private Object[] arr;
	private int numElems;

	public ListOnArray(int maxElem) {
		arr = new Object[maxElem];
		this.numElems = 0;
	}

	public void insert(T insOb) {
		if(isFull()){
			extendArr();
		}
		arr[numElems++] = insOb;
	}

	public T getElem(int index){
		T elem = (T) this.arr[index - 1];
		
		return elem;
	}
	
	public void display() {
		for (int i = 0; i < this.numElems; i++){
			System.out.print(arr[i].toString());
		}			
	}
	
	private void extendArr(){
		Object arrTemp[] = new Object[arr.length + 10];
		for(int i = 0; i<this.arr.length;i++){
			arrTemp[i] = this.arr[i];
		}
		this.arr = arrTemp;
	}
	
	public boolean isFull(){
		return this.numElems == arr.length;
	}
}
