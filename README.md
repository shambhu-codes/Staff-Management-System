# Staff Management System

## 📌 Project Description
The Staff Management System is a desktop-based application developed using Java Swing and MySQL. It is designed to manage staff records, attendance, approvals, and administrative operations in an efficient and organized manner.

---

## 🚀 Features
- 🔐 Login System (Admin & Clerk)
- 👨‍💼 Add Staff Details (by Clerk)
- ✅ Staff Approval (by Admin)
- 📅 Record & Update Attendance
- 🎉 Holiday Declaration
- 📊 Generate Reports
- 👁️ View Staff List
- 🔑 Change Password

---

## 🛠️ Technologies Used
- Java (Swing GUI)
- MySQL Database
- JDBC Connectivity
- NetBeans IDE

---

## 🗄️ Database Tables
- **login_table** – stores user credentials  
- **staff** – stores staff details  
- **attendance** – stores daily attendance  
- **holidays** – stores holiday records  

---

## 🔄 System Workflow
1. User logs in (Admin/Clerk)
2. Clerk adds staff → status = Pending  
3. Admin approves staff → status = Approved  
4. Attendance is recorded for approved staff  
5. Holidays are declared by admin  
6. Reports are generated when required  

---

## ▶️ How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Staff-Management-System.git
2.Open the project in NetBeans IDE <br>
3.Create the database in MySQL <br>
4.Import SQL tables (staff, attendance, login, holidays) <br>
5.Update database connection in your project <br>
6.Run the project <br>
👤 Author <br>
Shambhu Gouda
