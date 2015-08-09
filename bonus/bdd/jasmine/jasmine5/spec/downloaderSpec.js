describe("Downloader", function () {
    var answer = null;

    beforeEach(function (done) {
        var d = new Downloader();
        answer = d.download(
            "https://www.google.com/?q=ultimate%20answer%20to%20the%20universe",
            done);
    });

    it("wait download asynchronously", function () {
        expect(answer.content).toEqual("42");
    });
});