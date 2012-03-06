package strategyPattern;

public class HeapSort implements Sorter {

	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		for(int i=data.length/2-1; i>=0; i--)
			HeapAdjust(data, i, data.length);
		for(int i=data.length-1;i>0;i--){
			Comparable passingplace=data[i];
			data[i]=data[0];
			data[0]=passingplace;
			HeapAdjust(data, 0, i);
		}
	}
	public void HeapAdjust(Comparable[] array, int i, int nLength){
		int nChild;
		Comparable nTemp;
		for(nTemp=array[i]; 2*i+1<nLength; i=nChild){
			nChild=2*i+1;
			if(nChild<nLength-1&&array[nChild+1].compareTo(array[nChild])>0)
				nChild++;
			if(nTemp.compareTo(array[nChild])<0)
				array[i]=array[nChild];
			else 
				break;
			array[nChild]=nTemp;
		}
	}

}
