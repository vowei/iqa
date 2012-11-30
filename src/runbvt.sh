java -cp ../../java/lib/antlr-3.4-complete.jar org.antlr.Tool cc/iqa/iQA.g
javac -g -cp ../../java/lib/antlr-3.4-complete.jar cc/iqa/iQALexer.java cc/iqa/iQAParser.java iQATest.java
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseFeatures.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseFeatureScenarioBasic.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseComments.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseStepBasic.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseStepTableBasic.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseVariables.txt
java -cp ../../java/lib/antlr-3.4-complete.jar:. iQATest /media/work/workspace/iqa/iqa/iqa.test/res/testParseTblStepAssigns.txt
