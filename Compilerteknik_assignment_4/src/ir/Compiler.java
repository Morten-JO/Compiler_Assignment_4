package ir;




import ir.Compiler;


public class Compiler {
	
	private static String filename;
	private static String outputfilename;
		
	private static boolean debug;
	
	private static String[] arguments={ "" };
	

	public static void main(String[] args) throws Exception {
		
		Compiler comp = new Compiler(args);
		
		IR build = comp.generateIR();
		
		comp.generateCode(build);
		
		//PrettyPrinter.print(build);
		
		PrettyPrinter.printSentPackets(build.entries);
		

	}
	
	public Compiler(String[] args) throws Exception {
		//
		// here we should inspect the arguments
		//

		if (args.length==0) {
			help();
		}

		filename = null;
		debug = false;

		for (int i=0;i<args.length;i++) {
			String arg = args[i];
			if (arg.charAt(0)!='-') {

				//
				// store the filename
				//

				filename = args[i];
				outputfilename = filename.substring(0, filename.lastIndexOf('.'))+".asm";
			} else {
				if (arg.equals("-v")) {
					debug=true;
					continue;
				}
				if (arg.equals("-o")) {

					if (i==args.length) {
						throw new Exception("argument for -o is missing");
					}
					
					outputfilename = args[i++];
					continue;
				}
				if (arg.equals("--")) {
					// from here on the arguments should go to the program
					
					Compiler.arguments = new String[(args.length - i - 1)];
					for (int ai = i+1; ai<args.length; ai++) {
						Compiler.arguments[ai-i-1] = args[ai];
					}
					break;
				}
			}
		}
		
		if (filename == null) {
			throw new Exception("No filename specified");
		}

	}

	private void help() {
		// TODO Auto-generated method stub
		
	}
	
	public IR generateIR() throws Exception
	{
		IR ir=null;
		
		System.out.print("Parsing... ");

		try {
			ir = Frontend.parse(filename);
		} catch (Exception e) {
			throw new Exception("Parse Error: "+e.getMessage());
		}
		
		System.out.println("done.");

		
				
		System.out.println("done.");
		
		return ir;
	}
	
	public void generateCode(IR ir) throws Exception
	{
				
		System.out.println("Generating code... ");

		try {
			Backend.generateCode(ir);
		} catch (Exception e) {
			throw new Exception("CodeGenError "+e.getMessage());
		}
		
		System.out.println("done.");
	}

	public static String getFilename() {
		return filename;
	}

	public static void setFilename(String filename) {
		Compiler.filename = filename;
	}

	public static String getOutputfilename() {
		return outputfilename;
	}

	public static void setOutputfilename(String outputfilename) {
		Compiler.outputfilename = outputfilename;
	}

	public static boolean isDebug() {
		return debug;
	}

	public static void setDebug(boolean debug) {
		Compiler.debug = debug;
	}

	public static String[] getArguments() {
		return arguments;
	}

	public static void setArguments(String[] arguments) {
		Compiler.arguments = arguments;
	}

}
