编译命令：
	java -cp lib/antlr-3.4-complete.jar org.antlr.Tool cc/iqa/iQALexer.g
	java -cp lib/antlr-3.4-complete.jar org.antlr.Tool cc/iqa/iQAParser.g
	java -cp lib/antlr-3.4-complete.jar org.antlr.Tool cc/iqa/iQATree.g
        javac -cp lib/antlr-3.4-complete.jar cc/iqa/iQALexer.java cc/iqa/iQAParser.java cc/iqa/iQATree.java iQATest.java

运行命令：
        java -cp lib/antlr-3.4-complete.jar:. iQATest ../iqa.test/res/testParseStepBasic.txt cc/iqa/iQAMobileJUnit.stg
