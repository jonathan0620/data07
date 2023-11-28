package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기_list {

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 }; //==> {4,3,2,5}
		//리스트로 변환시키기
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			list.add(n[i]);
		}
		System.out.println(list);
		//최소값 찾아라
		int min = Collections.min(list);
		System.out.println(min);
		//최소값 지우기
		list.remove(min);
		System.out.println(list);

		int[] answer = null;
		System.out.println(Arrays.toString(answer));
	}

}