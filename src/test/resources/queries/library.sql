select *
from books;

select bc.name, count(*)
from book_borrow bb
         inner join books b on bb.book_id = b.id
         inner join book_categories bc on b.book_category_id = bc.id
group by bc.name
order by 2 desc;

select full_name,b.name,bb.borrowed_date, bb.returned_date from users u inner join book_borrow bb on u.id = bb.user_id
                                                      inner join books b on bb.book_id = b.id
where name= 'Baku Nights' order by 3 desc;
