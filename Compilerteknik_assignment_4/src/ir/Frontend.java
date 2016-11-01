package ir;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import irclasses.Entries;
import irclasses.Entry;
import recognizer.network_part2Lexer;
import recognizer.network_part2Parser;



public class Frontend {

	public static IR parse(String filename) throws Exception {
		
		ParseTree parseTree = null;
		
		try{
			
			// open the input file
			CharStream input = new ANTLRFileStream(filename);
			
			// create a lexer/scanner
			network_part2Lexer lex = new network_part2Lexer(input);
			
			// get the stream of tokens from the scanner
			CommonTokenStream tokens = new CommonTokenStream(lex);
			
			// create a parser
			network_part2Parser parser = new network_part2Parser(tokens);
			
			// and parse
			parseTree = parser.entries();
			
			// if we found errors, throw an exception
			if (parser.getNumberOfSyntaxErrors()>0) {
				throw new Exception("Found "+parser.getNumberOfSyntaxErrors()+" error" + 
						((parser.getNumberOfSyntaxErrors()>1)?"s":"") +".");
			}
		} catch (IOException e) {
			throw new Exception(e.getMessage());
		} catch (RecognitionException e) {
			throw new Exception(e.getMessage());
		}
		
		IRBuilder builder = new IRBuilder();
		
		return new IR((Entries)builder.visit(parseTree));
		
	}
}
