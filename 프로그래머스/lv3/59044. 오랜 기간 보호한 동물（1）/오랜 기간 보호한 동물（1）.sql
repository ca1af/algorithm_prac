-- 코드를 입력하세요
SELECT i.NAME, i.DATETIME FROM ANIMAL_INS i
left join ANIMAL_OUTS o on i.animal_id = o.animal_id
where o.animal_id is null
order by i.datetime
limit 3