import java.io.*;
import java.util.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import cc.iqa.*;

public class iQATest {
    public static void main(String[] args) throws Exception {	
	if ( args.length != 2 ) {
	    System.out.println("Usage: java iQATest <iqa file name> <stg file>");
	    return;
	}

	FileReader groupFileR = new FileReader(args[1]);
	StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
	
	ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]), "utf8");
	iQALexer lexer = new iQALexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	iQAParser parser = new iQAParser(tokens);
	iQAParser.prog_return r =  parser.prog();
	CommonTree t = (CommonTree)r.getTree();
	
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	nodes.setTokenStream(tokens);
	iQATree walker = new iQATree(nodes);
	walker.setTemplateLib(templates);
	iQATree.prog_return r2 = walker.prog("cc.iqa.studio.demo.test");
	StringTemplate output = (StringTemplate)r2.getTemplate();
	System.out.println(output.toString());
    }
}