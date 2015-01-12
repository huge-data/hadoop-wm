package zx.soft.hdfs.wm.output;

import java.io.IOException;

import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

/**
 * 
 * @author wgybzb
 *
 */
public class StubWriter extends RecordWriter<Object, Object> {

	@Override
	public void write(Object o, Object o2) throws IOException, InterruptedException {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void close(TaskAttemptContext taskAttemptContext) throws IOException, InterruptedException {
		//To change body of implemented methods use File | Settings | File Templates.
	}

}
