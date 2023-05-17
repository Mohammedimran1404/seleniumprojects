package mavenEX;

public class StringBuffers {



	public static void main(String[] args) {
		String s1="imraan";
		char []ar=s1.toCharArray();

		//StringBuffer sb = new StringBuffer(s1);

		int count;
		for(int i=0;i<ar.length-1;i++)
		{
			count=0;
			if(ar[i]==ar[i+1])
			{
				count++;

			}

			if(count==1)
			{
				break;
			}
			System.out.println(ar[i]);
		}

	}

}
