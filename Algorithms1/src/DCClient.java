import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class DCClient {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("D:/Workbook/Git/Algorithms1/Algorithms1/test_files/tinyUf.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		int N = StdIn.readInt();
		QuickFindUF uf = new QuickFindUF(N);
		while(!StdIn.isEmpty())
		{
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (!uf.connected(p, q))
			{
				uf.union(p, q);
				StdOut.println(p + " " + q);
				//System.out.println(p + " ");
			}
		}
	}

}
