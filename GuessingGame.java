public class GuessingGame{ 
	public static void main(String[] args)
	{
		int random;
		int guessing;

		if (args.length == 0 || args[0].equals("help"))
		{
			System.out.println("程式用法: java Guessing [1-5 數字]");
			return;
		} else if (!args[0].matches("\\d+")) //正則表達式
			{
				System.out.println("猜測內容需為數字!");
				return;				
			}
		
			guessing = Integer.parseInt(args[0]); //字串轉換成整數
			random = (int)(Math.random() * 5) + 1; //生成一個 1 到 5 之間的隨機整數
		if (guessing >5 || guessing <1)
		{
			System.out.println("猜測數字需 1-5 之間");
			return;						
		} else if (guessing == random)
			{
				System.out.println("恭喜猜對了!答案是"+ random);
			} else 
				{
					System.out.println("猜錯了!答案是 " + random);
				}
	}	

}