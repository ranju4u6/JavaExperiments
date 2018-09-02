package test.lamdas;

@FunctionalInterface
public interface CommonFinder<T> {
	
	boolean find(T type);

}
