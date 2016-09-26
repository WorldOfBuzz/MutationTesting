package uk.co.wob.mutationtesting.sample3;

public class Timeline {

	private int fetchCount;

	public Timeline() {
		fetchCount = 10; //bug, nincs tesztelve a kezdeti állapot. A Cobertura-t nem érdekli, de pitest jelez
	}

	public void setFetchCount(int fetchCount) {
		if (fetchCount <= 0) {
			String msg = "Argument 'fetchCount' must be a positive value.";
			throw new IllegalArgumentException(msg);
		}

		this.fetchCount = fetchCount;

	}

	public int getFetchCount() {
		return fetchCount;
	}
}
