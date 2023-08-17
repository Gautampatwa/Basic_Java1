package Lambda1;

public class LambdaExpression1 {

	public static void main(String[] args) {
		System.out.println("Hello Lambda");
		
		
		MyInter i=()->
		{
		System.out.println("I am using first time Lambda");
		};
		i.sayHello();
		// TODO Auto-generated method stub
		
		
		SumInterface suminter=(a,b)->
		{
			return a+b;
		};
		System.out.println(suminter.sum(12,12));
       
		
		LoopInter loop=(i1,j)->
		{
		return i1+j;
		};
		System.out.println(loop.Loop(10,10));
		
	}

}
