import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ShunXuShuChuZiFuChuan {
	public static void main(String[] args) {
		String str="aabbbaaccdejt";
//		List list=charToSet(str);
		Set list=charToSet(str);
		System.out.println(list);
	}

	private static Set charToSet(String str) {
		// TODO 自动生成的方法存根
		char[] cha=str.toCharArray();
		char[] cha1=new char[100]; 
//		ArrayList arrlist=new ArrayList();
		TreeSet trs1=new TreeSet();
		TreeSet trs2=new TreeSet();
		for(int i=0;i<cha.length-1;i++) {
			for(int j=0;j<cha.length-1-i;j++) {
				if(cha[j]==cha[j+1]) {
					cha1[i]=cha[j];
				}else if(cha[j]>cha[j+1]) {
					char temp=cha[j];
					cha[j]=cha[j+1];
					cha[j+1]=temp;
				}
			}
//			arrlist.add(cha[i]);
			trs1.add(cha[i]);
			
		}
		
		return trs1;
	}
}
