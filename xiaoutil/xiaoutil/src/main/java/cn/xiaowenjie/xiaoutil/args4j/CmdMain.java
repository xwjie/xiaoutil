package cn.xiaowenjie.xiaoutil.args4j;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * -line 20 -type PART -in c:\\1.txt
 * 
 * @author xwjie
 * @date 18.3.7
 *
 */
public class CmdMain {

	public static void main(String[] args) {
		SampleCmdOption option = new SampleCmdOption();
		CmdLineParser parser = new CmdLineParser(option);

		try {

			// if (args.length == 0){
			// showHelp(parser);
			// return;
			// }

			parser.parseArgument(args);
			
			// 得到参数
			System.out.println(option);

			// FIXME 为什么没有起作用
			if (option.arguments.isEmpty()) {
				showHelp(parser);
				return;
			}

			// 逻辑代码

		} catch (CmdLineException cle) {
			System.out.println("Command line error: " + cle.getMessage());

			showHelp(parser);
			return;
		} catch (Exception e) {
			System.out.println("Error in main: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}

	public static void showHelp(CmdLineParser parser) {
		System.out.println("命令 [options ...] [arguments...]");
		parser.printUsage(System.out);
	}

}