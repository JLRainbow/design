package ch30appendixA;

abstract class Animal {
	protected String name;
	protected int shoutNum  = 3;
	
	public void setShoutNum(int shoutNum) {
		if(shoutNum > 5){
			this.shoutNum = 5;
		}else{
			this.shoutNum = shoutNum;
		}
	}

	public String shout() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < shoutNum; i++) {
			sb.append(getShout());
		}
		return name+sb.toString();
		
	}
	
	protected abstract String getShout();
}
