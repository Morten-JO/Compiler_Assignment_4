package ir;



import compiler.Exceptions.CodeGenException;



public class Backend {

	public static void generateCode(IR ir) throws Exception {
		
		if (Compiler.isDebug()) {
			PrettyPrinter.print(ir);
		}
		
		
	}
}
