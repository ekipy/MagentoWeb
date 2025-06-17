# Magento Automation Testing Project

Proyek ini adalah sistem *automation testing* untuk website Magento, dibangun menggunakan Java, Cucumber (Gherkin), JUnit, Gradle, dan Selenium WebDriver. Tujuannya adalah memastikan bahwa fungsi-fungsi kunci Magento berjalan sesuai harapan melalui skenario pengujian end-to-end yang dapat diulang.

---

## 🎯 Tujuan Proyek

- Mengotomatiskan pengujian fitur penting di situs Magento (seperti homepage, register).
- Menyediakan dokumentasi pengujian yang dapat dipahami oleh non-teknis (menggunakan Gherkin).

---

## 🔧 Teknologi yang Digunakan

- **Java** – Bahasa utama automation
- **Cucumber** – Framework BDD (Behavior Driven Development)
- **Gherkin** – Penulisan skenario test readable
- **JUnit** – Test runner
- **Gradle** – Build & dependency management
- **Selenium WebDriver** – Interaksi dengan browser
- **WebDriverManager** – Otomatisasi download driver browser

---

## ⚙️ Penyiapan Proyek

### 1. Clone Repository
```bash
git clone https://github.com/ekipy/MagentoWeb.git
cd MagentoWeb
```

### 2. Jalankan Dependency Setup
```bash
./gradlew clean build
```

### 3.Struktur Direktori Utama
```bash
src/
├── main/
│   └── java/
│       └── magentoapps/        # Page Object Model (POM)
├── test/
│   ├── java/
│   │   ├── features/           # Langkah-langkah sesuai Gherkin
│   │   └── config/             # File Runner JUnit, setup driver manager
│   └── resources/
│       └── features/           # File .feature (Gherkin)
```

### 4.Download Extension yang dibutuhkan
- Install **Extension Pack For Java**
- Install **Cucumber (Gherkin) Full Support)**
- Install **Test Runner for Java**

## ▶️ Cara Menjalankan Pengujian dari Visual Studio

### 1. Buka menu Testing pada NavBar Menu
### 2. Click Run Test Pada Runner Path

atau

### 1. Buka Menu Explorer pada navbar
### 2. Buka File Runner.Java pada folder test/java/config
### 3. Click Run Test

## 🔍 Report & Logging
- Hasil test akan berada di: app\target\cucumber-reports.html

