# Java Selenium TestNG Automation Framework

This is a simple, reusable test automation framework using Java, Selenium WebDriver, TestNG, and WebDriverManager.  
It supports test case writing, data-driven testing, and automatic screenshot capture for failed test cases.

---

## 🛠 Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- WebDriverManager  
- Maven  

---

## 🚀 How to Run

1. Clone or download the repository.  
2. Import into Eclipse or IntelliJ as a Maven project.  
3. Right-click on `testng.xml` → Run As → TestNG Suite.  
4. Test cases will execute in the browser.  
5. On test failure, screenshots will be saved in the `screenshots/` folder.  

---

## ✍️ Writing Your Own Test Cases

- Go to `tests/TestScriptsClass.java`  
- Write your test methods with `@Test`  
- You can use data from `DataProviderClass` if needed  
- Tests will automatically use the base setup and listeners  

---

## 📝 Notes

- Screenshot capture works only for **failed** tests.  
- Make sure browser drivers (Chrome, Edge, etc.) are managed via WebDriverManager.  
- Application URL is set in `BaseClass.java`.  

---
