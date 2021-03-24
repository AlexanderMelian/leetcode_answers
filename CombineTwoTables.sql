# Write your MySQL query statement below
SELECT FirstName, LastName, City, State
FROM Person P
Left JOIN Address A ON P.PersonId = A.PersonId;