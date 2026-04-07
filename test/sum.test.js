const assert = require("node:assert/strict");
const sum = require("../src/sum");

assert.equal(sum(2, 3), 5);

console.log("All tests passed.");
