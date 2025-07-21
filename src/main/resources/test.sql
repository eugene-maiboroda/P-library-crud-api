SELECT *
FROM books;

SELECT *
FROM books
WHERE year BETWEEN 2009 AND 2015;

SELECT *
FROM books
WHERE id IN (2,3);

SELECT *
FROM books
WHERE year > 2015;

SELECT *
FROM books
WHERE year IS NOT NULL;

SELECT *
FROM books
WHERE year IS NULL;

SELECT *
FROM books
WHERE id IN (1,2);

SELECT DISTINCT (books.name)
FROM books;

SELECT MIN(books.id), books.name
FROM books
GROUP BY name;

SELECT *
FROM books
WHERE author = 'Jeka';


SELECT books.name, books.author, books.year, books.year,books.publishing
FROM books
GROUP BY books.name, books.author, books.year, books.year,books.publishing
HAVING count(*) > 1;


UPDATE books
SET author = 'Jeka'
WHERE id = 4;

INSERT INTO books
SET
    id = 6
  , name = 'Simon'
  , author = 'Bully'
  , publishing = 'OMG';