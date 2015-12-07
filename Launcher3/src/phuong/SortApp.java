package phuong;

import java.util.List;


public class SortApp {
	public void exchange_sort(List<Pac> list) {
		int i, j;
		Pac temp;
		for (i = 0; i < list.size(); i++) {
			for (j = i + 1; j < list.size(); j++) {
				if(list.get(i).label.compareToIgnoreCase(list.get(j).label) > 0){
					temp = list.get(i);
					list.set(i , list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	public static void changePos(List<Pac> list , int begin , int end){
		if(begin < end){
			Pac temp = list.get(begin);
			
			for(int i = begin ; i< end ; i++){
				list.set(i, list.get(i+1));
			}
			
			list.set(end, temp);
		} else if(begin > end){
			Pac temp = list.get(begin);
			
			for(int i = begin ; i > end ; i--){
				list.set(i, list.get(i-1));
			}
			
			list.set(end, temp);
		}
	}
}
