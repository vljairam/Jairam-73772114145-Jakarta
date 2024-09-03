Create table Employee (Emp_id int primary key, Emp_Name varchar(100), Emp_Address varchar(255), Emp_designation varchar(100), Emp_department varchar(100), Emp_Phone_No varchar(15), 
Emp_Basicpay decimal(10, 2), Emp_HRA decimal(10, 2), Emp_DA decimal(10, 2), Emp_TA decimal(10, 2), Emp_Salary decimal(10, 2));

Insert into Employee (Emp_id, Emp_Name, Emp_Address, Emp_designation, Emp_department, Emp_Phone_No, Emp_Basicpay) values(1, 'Ravi', '123 Elm St', 'Software Engineer', 'IT', '555-1234', 50000.00);
Insert into Employee (Emp_id, Emp_Name, Emp_Address, Emp_designation, Emp_department, Emp_Phone_No, Emp_Basicpay) values(2, 'Renu', '456 Oak St', 'Marketing Manager', 'Marketing', '555-5678', 60000.00);
Insert into Employee (Emp_id, Emp_Name, Emp_Address, Emp_designation, Emp_department, Emp_Phone_No, Emp_Basicpay) values(3, 'Preetha', '789 Pine St', 'HR Specialist', 'HR', '555-8765', 45000.00);
Insert into Employee (Emp_id, Emp_Name, Emp_Address, Emp_designation, Emp_department, Emp_Phone_No, Emp_Basicpay) values(4, 'Hema', '321 Maple St', 'Software Engineer', 'IT', '555-4321', 52000.00);
Insert into Employee (Emp_id, Emp_Name, Emp_Address, Emp_designation, Emp_department, Emp_Phone_No, Emp_Basicpay) values(5, 'Harshini', '654 Cedar St', 'Sales Representative', 'Sales', '555-6789', 47000.00);

Update Employee Set Emp_HRA = Emp_Basicpay * 0.10, Emp_DA = Emp_Basicpay * 0.02, Emp_TA = Emp_Basicpay * 0.02, Emp_Salary = Emp_Basicpay + Emp_HRA + Emp_DA + Emp_TA;

Select Emp_id, Emp_Name, Emp_department, Emp_Salary from Employee e1 where Emp_Salary = (Select MAX(e2.Emp_Salary) from EMPLOYEE e2 where e2.Emp_department = e1.Emp_department);