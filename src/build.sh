java -cp ../../java/lib/antlr-3.4-complete.jar org.antlr.Tool cc/iqa/iQATree.g
javac -g -cp ../../java/lib/antlr-3.4-complete.jar cc/iqa/iQALexer.java cc/iqa/iQAParser.java cc/iqa/iQATree.java iQATest.java
# java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest ../iqa.test/res/testParseStepBasic.txt cc/iqa/iQAMobileJUnit.stg
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest ../iqa.test/res/testParseExpressionBasic.txt cc/iqa/iQAMobileJUnit.stg