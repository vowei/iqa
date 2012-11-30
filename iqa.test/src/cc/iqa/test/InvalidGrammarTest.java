package cc.iqa.test;

import java.io.FileInputStream;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

import cc.iqa.iQALexer;
import cc.iqa.iQAParser;

public class InvalidGrammarTest {
    private String _baseDir = "/media/work/workspace/iqa/";

    private String combinePath(String path) {
	return _baseDir + path;
    }

	private iQAParser fromFile(String path) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(
				new FileInputStream(path), "utf8");
		iQALexer lexer = new iQALexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new iQAParser(tokens);
	}

	@Test
	public void testParseInvalidIndentation() throws Exception {
		iQAParser parser = fromFile(combinePath("iqa/iqa.test/res/testParseInvalidIndentation.txt"));
		parser.prog();
	}
	
	@Test
	public void test注释的缩进与步骤的缩进不协调的情况() throws Exception {
		iQAParser parser = fromFile(combinePath("iqa/iqa.test/res/testCommentAndStepMissIndent.txt"));
		iQAParser.prog_return result = parser.prog();
		CommonTree tree = (CommonTree)result.getTree();
		Assert.assertEquals(2, tree.getChild(1).getChild(0).getChildCount());
	}
}
