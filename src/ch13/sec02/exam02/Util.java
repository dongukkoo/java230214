package ch13.sec02.exam02;


public class Util {
	public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
		K k = pair.getKey();

		if (k.equals(key)) {
			return pair.getValue();
		}

		return null;
	}
}