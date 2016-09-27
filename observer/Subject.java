package observer;

/**
 * ����ӿ�
 * @author SmartMan
 *
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
}
