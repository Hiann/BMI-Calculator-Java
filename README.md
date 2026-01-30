<div align="center">

# ⚖️ Java BMI Calculator Pro
### Calculadora de IMC Desktop com Interface Gráfica

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/status-completed-green?style=for-the-badge)

<p align="center">
  <a href="#sobre">Sobre</a> •
  <a href="#features">Features</a> •
  <a href="#como-executar">Como Executar</a> •
  <a href="#autor">Autor</a>
</p>

</div>

---

<div id="sobre"></div>

## 💡 Sobre o Projeto

O **Java BMI Calculator** é uma aplicação desktop desenvolvida para demonstrar conceitos fundamentais de desenvolvimento em Java, incluindo **Orientação a Objetos**, **Padrão MVC (Separação de Lógica e Interface)** e criação de **GUI (Graphical User Interface)** com Swing.

Diferente de calculadoras simples de terminal, este projeto oferece uma experiência visual amigável, tratamento de erros de input e feedback visual dinâmico.

---

<div id="features"></div>

## 🚀 Features Técnicas

* **🎨 Interface Gráfica (GUI):** Desenvolvida com **Java Swing** e `AWT`, utilizando layouts customizados (`BorderLayout`, `GridLayout`) para um visual limpo e moderno.
* **🧠 Separação de Responsabilidades:** A lógica de cálculo (`BMIService`) é totalmente desacoplada da interface visual, seguindo boas práticas de Engenharia de Software.
* **🛡️ Tratamento de Erros:** O sistema trata entradas inválidas (ex: letras no lugar de números) usando blocos `try-catch` e exibe alertas amigáveis via `JOptionPane`.
* **✨ UX Refinada:** Aceita tanto ponto (`.`) quanto vírgula (`,`) como separador decimal e altera a cor do resultado (Verde/Vermelho) dependendo da saúde do usuário.

---

<div id="como-executar"></div>

## 📦 Como Executar

### Pré-requisitos
* **Java JDK 8** ou superior instalado.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/BMI-Calculator-Java.git](https://github.com/Hiann/BMI-Calculator-Java)
   cd BMI-Calculator-Java
