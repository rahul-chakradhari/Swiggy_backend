# 🍔 Swiggy Backend - Java OOP Project

A simple backend simulation of Swiggy implemented in **Java** using **Object-Oriented Programming (OOP)** principles.

---

## 🚀 Features & Services
This project provides **4 main services**:

1. **👤 User Services**  
   - Handles `Customer`, `Admin`, and `DeliveryPartner`.  
   - Uses **abstract classes** for inheritance and shared properties.
     <img width="830" height="288" alt="Image" src="https://github.com/user-attachments/assets/30f7b672-3bad-46c4-a77c-c7c68307bb23" />

2. **💳 Payment Services**  
   - Supports **UPI, Card, and Cash** payments.  
   - Implements **polymorphism** via a `Payment` superclass and specialized payment methods.  
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/8be27f15-96eb-4538-98ad-b69cd49a0272" />
3. **🍽️ Restaurant Services**  
   - Manage independent restaurants, menus, and dishes.  
   - Each restaurant is modeled as an independent class.
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/450e0de6-1b44-44f8-8747-265c9c459ac5" />
4. **🛒 Order Services**  
   - Handles placing, tracking, updating, and canceling orders.  
   - Shows **Has-A relationship** with `Customer` and `Payment` classes.
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/ac0d8505-0dbb-40f0-b4ff-f19cf0337bac" />
---

## 🛠️ OOP Design Highlights
- **Abstraction:** Abstract classes for User types to enforce shared structure.  
- **Inheritance:** Concrete user types extend the abstract User class.  
- **Polymorphism:** Payment operations (`makePayment`, `refundPayment`) demonstrate dynamic be
