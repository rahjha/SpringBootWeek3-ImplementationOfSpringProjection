INSERT INTO patient (name, birth_date, email, gender, blood_group) VALUES
('Rahul Sharma', '1994-05-12', 'rahul.sharma@gmail.com', 'MALE', 'O_POSITIVE'),
('Priya Verma', '1997-09-21', 'priya.verma@gmail.com', 'FEMALE', 'A_POSITIVE'),
('Amit Kumar', '1990-01-03', 'amit.kumar@gmail.com', 'MALE', 'B_POSITIVE'),
('Sneha Iyer', '1995-03-18', 'sneha.iyer@gmail.com', 'FEMALE', 'AB_POSITIVE'),
('Rohit Singh', '1988-11-30', 'rohit.singh@gmail.com', 'MALE', 'O_NEGATIVE'),
('Ananya Gupta', '2000-07-14', 'ananya.gupta@gmail.com', 'FEMALE', 'A_NEGATIVE'),
('Vikram Patel', '1992-02-26', 'vikram.patel@gmail.com', 'MALE', 'B_NEGATIVE'),
('Neha Malhotra', '1998-12-05', 'neha.malhotra@gmail.com', 'FEMALE', 'O_POSITIVE'),
('Suresh Reddy', '1985-06-09', 'suresh.reddy@gmail.com', 'MALE', 'AB_NEGATIVE'),
('Kavya Nair', '1996-04-22', 'kavya.nair@gmail.com', 'FEMALE', 'A_POSITIVE');

--INSERT INTO insurance (id, policy_number, provider, valid_till, created_at) VALUES
--(1, 'POL-IND-1001', 'HDFC ERGO', '2026-12-31', '2025-01-10 10:15:30'),
--(2, 'POL-IND-1002', 'ICICI Lombard', '2027-03-15', '2025-01-12 11:20:45'),
--(3, 'POL-IND-1003', 'Star Health', '2025-09-30', '2025-01-14 09:05:10'),
--(4, 'POL-IND-1004', 'Bajaj Allianz', '2026-06-20', '2025-01-16 14:40:55'),
--(5, 'POL-IND-1005', 'Religare Health', '2028-01-10', '2025-01-18 16:30:00'),
--(6, 'POL-IND-1006', 'Max Bupa', '2026-11-05', '2025-01-20 12:10:25'),
--(7, 'POL-IND-1007', 'Tata AIG', '2027-08-18', '2025-01-22 18:45:35'),
--(8, 'POL-IND-1008', 'Care Health Insurance', '2025-12-25', '2025-01-24 08:55:50'),
--(9, 'POL-IND-1009', 'Aditya Birla Health', '2026-04-14', '2025-01-26 13:35:15'),
--(10,'POL-IND-1010', 'Niva Bupa', '2027-10-09', '2025-01-28 17:25:40');

INSERT INTO doctor (name, specialization, email) VALUES
('Dr. Amit Sharma', 'Cardiology', 'amit.sharma@hospital.com'),
('Dr. Neha Verma', 'Dermatology', 'neha.verma@hospital.com'),
('Dr. Rajesh Iyer', 'Orthopedics', 'rajesh.iyer@hospital.com'),
('Dr. Pooja Kulkarni', 'Gynecology', 'pooja.kulkarni@hospital.com'),
('Dr. Anil Mehta', 'Neurology', 'anil.mehta@hospital.com');