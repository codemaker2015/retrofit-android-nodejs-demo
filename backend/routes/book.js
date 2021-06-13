var express = require('express')
var router = express.Router()
const book = require('../db_handlers/book')

router.get('/', (req, res) => {
  book.getBooks()
    .then(response => {
      res.status(200).send(response);
    })
    .catch(error => {
      res.status(500).send(error);
    })
})

module.exports = router
