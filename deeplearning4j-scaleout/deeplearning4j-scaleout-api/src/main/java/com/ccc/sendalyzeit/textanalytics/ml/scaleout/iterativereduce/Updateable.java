package com.ccc.sendalyzeit.textanalytics.ml.scaleout.iterativereduce;

import java.nio.ByteBuffer;
/**
 * Loosely based on the iterative reduce specification seen here:
 * https://github.com/emsixteeen/IterativeReduce/blob/master/src/main/java/com/cloudera/iterativereduce/Updateable.java
 * 
 * @author Adam Gibson
 *
 * @param <RECORD_TYPE>
 */
public interface Updateable<RECORD_TYPE> {

	ByteBuffer toBytes();
	
	void fromBytes(ByteBuffer b);
	
	void fromString(String s);
	
	RECORD_TYPE get();
	
	void set(RECORD_TYPE type);
}