package cc.iqa.test;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import cc.iqa.iQALexer;
import cc.iqa.iQAParser;

public class ParseiQAStringTest {

	private iQAParser fromString(String iqa) throws Exception {
		InputStream query = new ByteArrayInputStream(iqa.getBytes("utf8"));
		ANTLRInputStream input = new ANTLRInputStream(query);
		iQALexer lexer = new iQALexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new iQAParser(tokens);
	}

	@Test
	public void testParseFeaturesFromString() throws Exception {
		iQAParser parser = fromString("功能: 鑫财通手机炒股功能测试\n" + "   \n"
				+ "   功能: 功能测试");
		parser.prog();
	}

	private String removeKeyword(String line, String keyword)
	{
		if ( line.startsWith(keyword) ){
			int index = keyword.length();
			int enIdx = line.indexOf(':', index);
			int cnIdx = line.indexOf('：', index);
			
			if ( enIdx >= 0 && cnIdx < 0 )
				index = enIdx;
			else if ( enIdx < 0 && cnIdx >= 0 )
				index = cnIdx;
			else if ( enIdx >= 0 && cnIdx >= 0 )
				index = Math.min(enIdx, cnIdx);
			
			return line.substring(index + 1).trim();
		} else {
			return line;
		}
	}
	
	private String removeQuote(String value, char quote)
	{
		if ( value.charAt(0) != quote ) {
			return value;
		}
		else {
			return value.substring(1, value.length() - 1);
		}
	}
	
	@Test
	public void testRemoveKeyword()
	{
		Assert.assertEquals("具有缩进编写方式的功能", removeKeyword("功能: 具有缩进编写方式的功能", "功能"));
		Assert.assertEquals("具有缩进编写方式的功能", removeKeyword("功能：具有缩进编写方式的功能", "功能"));
		Assert.assertEquals("这是一个步骤", removeKeyword("* 这是一个步骤", "*"));
	}
	
	@Test
	public void testRemoveQuote()
	{
		Assert.assertEquals("变量", removeQuote("[变量]", '['));
		Assert.assertEquals("变量", removeQuote("\"变量\"", '\"'));
		Assert.assertEquals("变量", removeQuote("\'变量\'", '\''));
		Assert.assertEquals("变量", removeQuote("“变量”", '“'));
		Assert.assertEquals("变量", removeQuote("‘变量’", '‘'));
	}
}
