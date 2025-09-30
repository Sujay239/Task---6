# 📝 Java Swing To-Do App

A simple **To-Do List Application** built with **Java Swing**.  
This app allows users to add tasks with a due date and time, view them in a list, and remove completed tasks.  

---

## 🚀 Features
- Add new tasks with:
  - **Task Name**
  - **Created Time** (auto-generated)
  - **Due Time** (entered by user in `YYYY-MM-DDTHH:MM` format)
- Display tasks in a scrollable list.
- Delete selected tasks from the list.
- Simple and interactive GUI built with Swing.

---

## 🛠️ Tools & Technologies
- **Java 8+**
- **Swing (built-in Java GUI library)**
- **IntelliJ IDEA CE** / **Eclipse** (recommended IDE)

---

## 📂 Project Structure
```
├── Main.java # Main application code with GUI
└── README.md # Documentation
```


---

## ▶️ How to Run
1. Clone or download this project.  
2. Open it in your preferred IDE (**IntelliJ IDEA CE** or **Eclipse**).  
3. Compile and run `Main.java`.  
4. The **To-Do App** window will open.

---

## 🖥️ Usage
1. Click **Add Task** → Enter:
   - Task name
   - Due date and time in format: `YYYY-MM-DDTHH:MM`  
   Example: `2025-10-01T14:30`
2. Task will be displayed as:
Task: Study Java | Created: 2025-09-30T12:45:32 | To Do: 2025-10-01T14:30
3. Select a task and click **Remove Task** to delete it.  

---

## 📸 Screenshot (example layout)
```
+----------------------------------------+
| To-Do App |
+----------------------------------------+
| Task List (Scrollable) |
| - Task: Study Java | Created: ... |
| | To Do: ... |
| |
+----------------------------------------+
| [ Add Task ] [ Remove Task ] |
+----------------------------------------+
```

---

## 📌 Notes
- The app uses **`JOptionPane` dialogs** to input task details.  
- Ensure to follow the **date-time format** (`YYYY-MM-DDTHH:MM`) to avoid parsing errors.  
- Built entirely with **Java Swing**, no external libraries required.  

---

👨‍💻 **Author**: *Sujay Kumar Kotal*  
📅 **Project**: Java GUI – To-Do App
