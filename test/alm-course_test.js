'use strict';

var alm_course = require('../lib/alm-course.js');

/*
  ======== A Handy Little Nodeunit Reference ========
  https://github.com/caolan/nodeunit
  Test methods:
    test.expect(numAssertions)
    test.done()
  Test assertions:
    test.ok(value, [message])
    test.equal(actual, expected, [message])
    test.notEqual(actual, expected, [message])
    test.deepEqual(actual, expected, [message])
    test.notDeepEqual(actual, expected, [message])
    test.strictEqual(actual, expected, [message])
    test.notStrictEqual(actual, expected, [message])
    test.throws(block, [error], [message])
    test.doesNotThrow(block, [error], [message])
    test.ifError(value)
*/

exports['welcomeMessage'] = {
  setUp: function(done) {
    // setup here
    done();
  },
  'all tests': function(test) {
    test.expect(2);
    // tests here
    test.equal(alm_course.sum(1,2), 3, '1+2 should be 3.');
    test.equal(alm_course.sum(1), 1, 'sum of 1 and nothing should be 1.');
    test.done();
  },
};