// conf.js
exports.config = {
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['e2e.js'],
    multiCapabilities: [{
	browserName: 'firefox'
    }]
}