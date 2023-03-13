package ch16.sec04.test;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}
