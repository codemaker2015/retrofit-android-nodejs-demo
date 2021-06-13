require('dotenv').config()

const express = require('express')
const app = express()
const port = process.env.PORT || 3001
var logger = require('morgan');

const bookRouter = require('./routes/book')

app.use(express.json())
app.use(logger('dev'));

app.use(function (req, res, next) {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET,POST,PUT,DELETE,OPTIONS');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type, Access-Control-Allow-Headers');
  next();
});

app.use(express.static('public'))

app.get('/', (req, res) => {
  res.status(200).send("Retrofit Demo Server");
})
app.use('/book', bookRouter)

app.listen(port, () => {
  console.log(`App running on port ${port}.`)
})