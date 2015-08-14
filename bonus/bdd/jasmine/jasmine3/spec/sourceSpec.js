describe("Person", function() {
    it("calls the sayHello() function", function() {
	var fakePerson = new Person();
	spyOn(fakePerson, "sayHello");
	fakePerson.helloSomeone("world");
	expect(fakePerson.sayHello).toHaveBeenCalled();
    });

    it("greets the world", function() { 
	var fakePerson = new Person();
	spyOn(fakePerson, "helloSomeone");
	fakePerson.helloSomeone("world");
	expect(fakePerson.helloSomeone).toHaveBeenCalledWith("world");
    });

    it("not greets the foo", function() {
	var fakePerson = new Person();
	spyOn(fakePerson, "helloSomeone");
	fakePerson.helloSomeone("world");
	expect(fakePerson.helloSomeone).not.toHaveBeenCalledWith("foo");
    });
});
