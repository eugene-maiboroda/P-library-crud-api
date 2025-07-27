INSERT INTO books (author, genre, name, publishing, year) VALUES
                                                              ('George Orwell', 'DETECTIVE', '1984', 'Secker & Warburg', '1949-06-08'),
                                                              ('J.K. Rowling', 'FANTASY', 'Harry Potter and the Philosopher\'s Stone', 'Bloomsbury', '1997-06-26'),
                                                              ('Harper Lee', 'COMEDY', 'To Kill a Mockingbird', 'J.B. Lippincott & Co.', '1960-07-11'),
                                                              ('J.R.R. Tolkien', 'FANTASY', 'The Hobbit', 'George Allen & Unwin', '1937-09-21'),
                                                              ('Yuval Noah Harari', 'SCIENCE_FICTION', 'Sapiens: A Brief History of Humankind', 'Harvill Secker', '2011-01-01');


SELECT *
FROM books ;

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