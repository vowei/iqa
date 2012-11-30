package cc.iqa.test;

import java.io.*;

import org.antlr.runtime.*;
import org.junit.Test;

import cc.iqa.*;

public class GrammarParserTest {
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
	
	private void helper(String path) throws Exception {
		iQAParser parser = fromFile(combinePath(path));
		parser.prog();
		
		if ( parser.getErrors() != null && parser.getErrors().size() > 0) {
			throw new IllegalStateException("语法有问题！");
		}
	}

	@Test
	public void testParseFeatureScenario() throws Exception {
		helper("iqa/iqa.test/res/testParseFeatureScenarioBasic.txt");
	}
	
	@Test
	public void testParseFeatures() throws Exception {
		helper("iqa/iqa.test/res/testParseFeatures.txt");
	}

	@Test
	public void testParseComments() throws Exception {
		helper("iqa/iqa.test/res/testParseComments.txt");
	}

	@Test
	public void testParseStepsBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseStepBasic.txt");
	}

	@Test
	public void testParseStepTableBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseStepTableBasic.txt");
	}

	@Test
	public void testParseVariableBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseVariables.txt");
	}
	
	@Test
	public void testParseTblStepAssignsBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseTblStepAssigns.txt");
	}

	@Test
	public void testParseExpressionBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseExpressionBasic.txt");
	}
	
	@Test
	public void testParseAssignStep() throws Exception {
		helper("iqa/iqa.test/res/testParseAssignStep.txt");
	}

	@Test
	public void testParseConditionStepBasic() throws Exception {
		helper("iqa/iqa.test/res/testParseConditionStepBasic.txt");
	}
	
	@Test
	public void testParseNestedCondition() throws Exception {
		helper("iqa/iqa.test/res/testParseNestedCondition.txt");		
	}
	
	@Test
	public void testParseSwitchCondition() throws Exception {
		helper("iqa/iqa.test/res/testParseSwitchCondition.txt");				
	}
	
	@Test
	public void testParseChineseColon() throws Exception {
		helper("iqa/iqa.test/res/testParseChineseColon.txt");				
	}
	
	@Test
	public void testDebugOnly() throws Exception {
		helper("iqa/iqa.test/res/testDebugOnly.txt");
	}
}
