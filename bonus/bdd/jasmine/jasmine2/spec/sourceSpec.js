describe("Hello world", function() {
    beforeEach(function() {
	jasmine.addMatchers({
	    toBeDivisibleByTwo: function() {
		return {
		    compare: function(actual, expected) {		
			var result = {
			    pass: (actual % 2) === 0
			};

			/*
			if ( result.pass ) {
			    result.message = actual + " is dividable!";
			} else {
			    result.message = actual + " is not dividable!!!";
			}
			*/

			return result;
		    }
		};
	    }
	});
    });

    it("is divisible by 2", function() {
	expect(gimmeANumber()).toBeDivisibleByTwo();
    });
});
