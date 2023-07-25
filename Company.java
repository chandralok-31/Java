class Company
{
	int n;
	boolean f=false;
	// f=false: chance: producer
	//f=true: chance :consumer
	synchronized public void produce_item(int n)
	{
		
		this.n=n;
		System.out.println("Produced : "+this.n);
		
	}

	synchronized public int consume_item()
	{
		
		System.out.println("Consumed : "+this.n);
		
		return this.n;
	}
}
