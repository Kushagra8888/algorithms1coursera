



public class QuickFindUF {
	private int[] id;
	
	/*
	 *  Constructor to initialize a data structure with N objects(0 to N - 1)
	 */
	QuickFindUF(int N)
	{
		id = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = N;
		}
	}
	
	/* 
	 * Add connection between p and q
	 */
	void union(int p, int q)
	{
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++)
		{
			if (id[i] == pid) id[i] = qid;
		}
	}
	
	/*
	 * Are p and q connected
	 */
	boolean connected(int p , int q)
	{
		return id[p] == id[q];
	}
	
	/*
	 * component identifier for p(0 to N-1)
	 */
	//int find(int p)
	
	/*
	 * number of components
	 */
	//int count()
}
