test("equal断言用法演示", function() {
    equal(0, 0, "两个0之间想等，通过断言！");
    equal("", 0, "空字符串和0是想等的，通过断言！");
    equal("", "", "两个空字符串想等，通过断言！");
    equal("three", 3, "Three和3不想等，断言失败！");
    equal(null, false, 
        "null和false不想等，断言失败！");
});
