package dip;

public interface IWorker {

	public void work();
}

class Worker1 implements IWorker{

	public void work() {
		
		//....working much more
		
	}
}

class SuperWorker1 implements IWorker {
	public void work() {
		
	}
}


class Manager1 {
	IWorker worker;
	
	public void setWorker(IWorker w) {
		worker = w;
	}
	
	public void manager() {
		worker.work();
	}
}


