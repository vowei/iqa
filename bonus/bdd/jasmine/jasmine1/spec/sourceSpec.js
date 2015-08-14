describe("Hello world", function() {
    it("says hello", function() {
	expect(helloWorld()).toEqual("Hello world!");
    });

    it("says world", function() {
	expect(helloWorld()).toContain("world");
    });
});
