<div align="center">

# ⚖️ Java BMI Calculator Pro
### Monitoramento de Saúde e Cálculo de IMC

<br>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/status-completed-green?style=for-the-badge)

<p align="center">
  <a href="#sobre">Sobre</a> •
  <a href="#tabela-imc">Tabela IMC</a> •
  <a href="#tecnologias">Tecnologias</a> •
  <a href="#como-executar">Como Executar</a> •
  <a href="#autor">Autor</a>
</p>

</div>

---

<div id="sobre"></div>

## 💡 Sobre o Projeto

O **Java BMI Calculator** é uma aplicação desktop focada em saúde e bem-estar. Seu objetivo principal é permitir que o usuário calcule seu **Índice de Massa Corporal (IMC)** de forma rápida, visual e precisa.

Diferente de calculadoras genéricas, este software oferece um **feedback visual imediato**: a interface muda de cor (verde para saudável, vermelho para alerta) e informa exatamente em qual categoria clínica o usuário se encontra, auxiliando na conscientização sobre a saúde física.

---

<div id="tabela-imc"></div>

## 📊 Entendendo o IMC

O Índice de Massa Corporal é calculado dividindo o peso (em kg) pela altura ao quadrado (em metros). O sistema segue a classificação oficial da **Organização Mundial da Saúde (OMS)**:

| Classificação | IMC (kg/m²) | Feedback do Sistema |
|:---|:---:|:---:|
| **Abaixo do Peso** | < 18,5 | ⚠️ Alerta |
| **Peso Normal** | 18,5 a 24,9 | ✅ Saudável (Verde) |
| **Sobrepeso** | 25,0 a 29,9 | ⚠️ Alerta |
| **Obesidade Grau I** | 30,0 a 34,9 | 🚨 Cuidado |
| **Obesidade Grau II** | 35,0 a 39,9 | 🚨 Cuidado |
| **Obesidade Mórbida** | ≥ 40,0 | 🚨 Perigo |

---

<div id="tecnologias"></div>

## 🚀 Diferenciais Técnicos

Este projeto vai além de uma simples fórmula matemática. Ele foi arquitetado seguindo padrões de engenharia de software:

* **🎨 Interface Gráfica (GUI):** Construída com **Java Swing**, fugindo do terminal preto e branco para oferecer uma experiência de usuário (UX) amigável.
* **🧠 Arquitetura MVC:** O código separa totalmente a regra de negócio (`BMIService`) da interface visual (`BMIInterface`). Isso facilita testes e manutenção.
* **🛡️ Tratamento de Dados:** O sistema é robusto contra erros de digitação (aceita tanto `.` quanto `,` como separador decimal) e previne falhas se o usuário digitar letras.

---

<div id="como-executar"></div>

## 📦 Como Executar

### Pré-requisitos
* **Java JDK 8** ou superior instalado.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Hiann/BMI-Calculator-Java.git](https://github.com/Hiann/BMI-Calculator-Java.git)
   cd BMI-Calculator-Java

 [![LinkedIn](https://img.shields.io/badge/LinkedIn-Conectar-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/hiann-alexander)
