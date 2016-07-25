'use strict';

const express = require('express');
const app = express();

// Application
app.get('/reverse/:inpt', function (req, res) {
  var ans = '';
  const inpt = req.params.inpt;

  for (var i = inpt.length-1; i >= 0; i--)
     ans += inpt[i];

  res.send(ans);
});

const PORT = 8080
app.listen(PORT, function ()  {
  console.log('Webservice up on http://localhost:' + PORT);
});
