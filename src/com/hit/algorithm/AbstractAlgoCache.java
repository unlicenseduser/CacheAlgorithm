package com.hit.algorithm;

public abstract class AbstractAlgoCache<K,V> extends java.lang.Object implements IAlgoCache<K, V>{
	
		public int capacity;
		public AbstractAlgoCache(int capacity) {
			this.capacity=capacity;
		}

}
