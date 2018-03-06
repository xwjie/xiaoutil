package cn.xiaowenjie.xiaoutil.args4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import lombok.Data;

enum Type {
	DOC, PART, BOM
}

@Data
public class SampleCmdOption {

	@Option(name = "-type", usage = "输入类型: DOC/PART/BOM")
	public Type type;

	@Option(name = "-log", usage = "是否显示日志")
	public boolean showlog = false;

	@Option(name = "-in", usage = "输入文件", required = true, metaVar = "文件")
	public File inFile = null;
	
	@Option(name = "-out", usage = "输出文件")
	public File outFile = null;

	@Option(name = "-line", usage = "这是一个数字参数", metaVar = "数字")
	public int line = 0;
	
	@Argument
	public List<String> arguments = new ArrayList<String>();
}
