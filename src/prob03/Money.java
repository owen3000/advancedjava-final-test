package prob03;

public class Money {

	
	private int amount;
	
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public Object add(Money money) {
		if(money==null) {
			return null;
		}
		return new Money(this.amount+money.amount);
	}

	public Object minus(Money money) {
		if(money==null) {
			return null;
		}
		return new Money(this.amount-money.amount);
	}

	public Object multiply(Money money) {
		if(money==null) {
			return null;
		}
		return new Money(this.amount*money.amount);
	}

	public Object devide(Money money) {
		if(money==null) {
			return null;
		}
		return new Money(this.amount/money.amount);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Money) {
			if(this.amount == ((Money)obj).amount) {
				return true;
			}
		}
		return false;
	}
    
    
}
