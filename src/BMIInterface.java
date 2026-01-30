

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BMIInterface extends JFrame {

    private JTextField txtPeso;
    private JTextField txtAltura;
    private JLabel lblResultado;
    private JLabel lblClassificacao;
    private BMIService bmiService; // Conecta com a lógica

    public BMIInterface() {
        // Inicializa a lógica
        this.bmiService = new BMIService();

        // Configurações da Janela
        setTitle("Calculadora de IMC Pro");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza na tela
        setLayout(new BorderLayout());
        setResizable(false);

        // --- PAINEL SUPERIOR (TÍTULO) ---
        JPanel panelHeader = new JPanel();
        panelHeader.setBackground(new Color(75, 110, 175)); // Azul Profissional
        JLabel title = new JLabel("Cálculo de IMC");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        panelHeader.add(title);
        panelHeader.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        // --- PAINEL CENTRAL (INPUTS) ---
        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(5, 1, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40)); // Margens
        panelForm.setBackground(Color.WHITE);

        // Input Peso
        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtPeso = new JTextField();
        txtPeso.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        // Input Altura
        JLabel lblAltura = new JLabel("Altura (ex: 1.75):");
        lblAltura.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtAltura = new JTextField();
        txtAltura.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        // Botão Calcular
        JButton btnCalcular = new JButton("CALCULAR MEU IMC");
        btnCalcular.setBackground(new Color(46, 204, 113)); // Verde Moderno
        btnCalcular.setForeground(Color.WHITE);
        btnCalcular.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnCalcular.setFocusPainted(false);
        btnCalcular.setBorderPainted(false);
        
        // Ação do Botão
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        panelForm.add(lblPeso);
        panelForm.add(txtPeso);
        panelForm.add(lblAltura);
        panelForm.add(txtAltura);
        panelForm.add(btnCalcular);

        // --- PAINEL INFERIOR (RESULTADO) ---
        JPanel panelResult = new JPanel();
        panelResult.setLayout(new BoxLayout(panelResult, BoxLayout.Y_AXIS));
        panelResult.setBackground(new Color(245, 245, 245));
        panelResult.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        lblResultado = new JLabel("Seu IMC: --");
        lblResultado.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblResultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblResultado.setForeground(new Color(50, 50, 50));

        lblClassificacao = new JLabel("Classificação: --");
        lblClassificacao.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblClassificacao.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblClassificacao.setForeground(new Color(100, 100, 100));

        panelResult.add(lblResultado);
        panelResult.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço
        panelResult.add(lblClassificacao);

        // Adiciona tudo à Janela Principal
        add(panelHeader, BorderLayout.NORTH);
        add(panelForm, BorderLayout.CENTER);
        add(panelResult, BorderLayout.SOUTH);
    }

    private void calcular() {
        try {
            // Pega o texto e troca vírgula por ponto (para evitar erro)
            String pesoStr = txtPeso.getText().replace(",", ".");
            String alturaStr = txtAltura.getText().replace(",", ".");

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            double imc = bmiService.calcularIMC(peso, altura);
            String classificacao = bmiService.obterClassificacao(imc);

            // Formata para 2 casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            
            lblResultado.setText("Seu IMC: " + df.format(imc));
            lblClassificacao.setText(classificacao);

            // Muda a cor do texto dependendo do resultado (Visual Feedback)
            if (imc >= 18.5 && imc < 24.9) {
                lblResultado.setForeground(new Color(46, 150, 60)); // Verde
            } else {
                lblResultado.setForeground(new Color(192, 57, 43)); // Vermelho
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, digite números válidos.", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);
        }
    }
}