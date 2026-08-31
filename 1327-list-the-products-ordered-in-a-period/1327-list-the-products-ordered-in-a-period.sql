# Write your MySQL query statement below
# Write your MySQL query statement below
select p.product_name , sum(unit)as unit from Products p
left join Orders o on p.product_id = o.product_id 
where o.order_date like '2020-02-%'
group by o.product_id ,p.product_id 
having  sum(o.unit)>=100;
