
class ArrayJagged{

	public static void main(String ar[]){
	int[][] i = {
		{1,6,4,3,3,2,2,2,2,2,2,} ,
		{4} ,
		{7,0,8,6,6,55,5} ,
		{6,8,6,5,4,4,3}
		
		
		};

		for(int a=0; a < i.length; a++){
			for(int b=0; b< i[a].length; b++){
			     System.out.print(i[a][b]+"  ");
			}
			System.out.println();
		}	
	}

}