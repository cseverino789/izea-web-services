'use strict';

const express = require('express');
const app = express();

// Application
app.get('/reverse/:in', function (req, res) {
  res.send(req.params);
});

const PORT = 8080
app.listen(PORT, function ()  {
  console.log('Webservice up on http://localhost:' + PORT);
});
