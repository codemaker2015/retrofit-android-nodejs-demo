const fs = require("fs");

const getBooks = () => {
  return new Promise(function(resolve, reject) {
    fs.readFile("./books.json", "utf8", (err, res) => {
      if (err) {
        console.log("Error reading file from disk:", err);
        reject(err);
      }
      try {
        resolve(JSON.parse(res).books);
      } catch (err) {
        console.log("Error parsing JSON string:", err);
        reject(err);
      }
    });
  }) 
}

module.exports = {
  getBooks
}