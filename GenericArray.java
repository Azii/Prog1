package;

public class GenericArray<T>
{
	private Object [] arr;
	private int length;
	
	public GenericArray(int length)
	{
		arr = new Object[length];
		this.length = length;
	}
	
	public T get(int index)
	{
		if (isInBounds(index))
			return (T)arr[index];
		else
			return null;
	}
	
	public void put(T toAdd, int index)
	{
		
	}
	
	private boolean isInBounds(int index)
	{
		return (index > 0 && index < length);
	}
}