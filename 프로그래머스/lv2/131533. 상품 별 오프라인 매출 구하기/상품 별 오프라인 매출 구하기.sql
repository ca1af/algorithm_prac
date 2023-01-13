SELECT p.product_code, sum(p.price*o.sales_amount) as SALES from product p
join offline_sale o on o.product_id = p.product_id
group by p.product_code
order by sales desc, p.product_code