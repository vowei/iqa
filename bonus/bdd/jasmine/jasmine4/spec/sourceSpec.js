describe("Person", function() {
    it("says hello", function() {
	var fakePerson = new Person();
	fakePerson.sayHello = jasmine
	    .createSpy("Say-hello spy");
	fakePerson.helloSomeone("world");
	expect(fakePerson.sayHello).toHaveBeenCalled();
    });

    it("says ello ello", function() {
	var fakePerson = new Person();
	fakePerson.sayHello = jasmine
	    .createSpy("say bonjour")
	    .and
	    .callFake(function() {
		console.log("Time to say bonjour");
		return "bonjour";
	    });

        fakePerson.helloSomeone("world");
        expect(fakePerson.sayHello).toHaveBeenCalled();
    });
});
