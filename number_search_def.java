package JavaCustomLib.all;
import JavaCustomLib.all.sort_def;

public class number_search_def {
	private  int Arr_len;
	private double[] Usr_arr = new double [Arr_len];
	private int Ini_pos;
	private double Search_num;
	
	public number_search_def(int arr_len, double[] usr_arr, int ini_pos, double search_num) {
		this.Arr_len = arr_len;
		this.Usr_arr = usr_arr;
		this.Ini_pos = ini_pos;
		this.Search_num = search_num;
	}
	
	public int linear_srch() {
		int counter;
		for (counter = 0 ; counter < Arr_len; ++counter) {
			if (Usr_arr[counter] == Search_num) {
				return counter;
			}
		}
		return -1;
	}
	
	public int binary_srch() {
		int End_pos = Arr_len - 1;
		while (End_pos >= Ini_pos) {
			int Mid_pos = (Ini_pos + End_pos) / 2;
			
			if (Usr_arr[Mid_pos] == Search_num) {
				return Mid_pos;
			}
			else if (Usr_arr[Mid_pos] > Search_num) {
				End_pos = Mid_pos - 1;
			}
			else {
				Ini_pos = Mid_pos + 1;
			}
		}
		return -1;
	}
}
