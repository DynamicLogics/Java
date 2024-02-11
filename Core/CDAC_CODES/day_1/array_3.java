 class array_3
{
		public static void main(String args[])
	{
		int c[][][]={{{1,2,3},
					  {4,5,6},
					 //{7,8,9}
					 },
					 {{10,11,12},
					  {13,14,15},
					  //{16,17,18}
					 }
					};
		
	  
      for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
			for(int k=0;k<c[i][j].length;k++)
			{
		System.out.print(c[i][j][k]);
			}System.out.println("");
		}		
		// System.out.println(c.length+"  "+c[0].length+"  "+c[1].length);
		
		
		
	}
	
}

}