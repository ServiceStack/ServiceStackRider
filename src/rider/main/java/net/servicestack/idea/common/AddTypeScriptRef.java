package net.servicestack.idea.common;

import com.intellij.openapi.module.Module;
import com.intellij.ui.JBColor;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.util.Locale;

public class AddTypeScriptRef extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField addressUrlTextField;
    private JTextField nameTextField;
    private JTextPane errorTextPane;
    private JTextPane infoTextPane;
    private JCheckBox onlyTypeScriptDefinitionsCheckBox;

    private String selectedDirectory;
    private String errorMessage;

    private Module module;

    public AddTypeScriptRef(Module module) {
        this.module = module;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        ImageIcon imageIcon = IDEAUtils.createImageIcon("/servicestack-64.png", "ServiceStack");
        if (imageIcon != null) {
            this.setIconImage(imageIcon.getImage());
        }
        errorTextPane.setForeground(JBColor.RED);

        buttonOK.setEnabled(false);

        addressUrlTextField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = null;
                if (input instanceof JTextField) {
                    text = ((JTextField) input).getText();
                }

                return text != null && text.length() > 0;
            }

            @Override
            public boolean shouldYieldFocus(JComponent input, JComponent target) {
                boolean valid = verify(input);
                if (!valid) {
                    errorMessage = "URL Address is required";
                    errorTextPane.setVisible(true);
                    errorTextPane.setText(errorMessage);
                }

                return true;
            }
        });
        nameTextField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = null;
                if (input instanceof JTextField) {
                    text = ((JTextField) input).getText();
                }

                return text != null && !text.isEmpty();
            }

            @Override
            public boolean shouldYieldFocus(JComponent input, JComponent target) {
                boolean valid = verify(input);
                if (!valid) {
                    errorMessage = "A file name is required.";
                    errorTextPane.setVisible(true);
                    errorTextPane.setText(errorMessage);
                }

                return true;
            }
        });

        nameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                buttonOK.setEnabled(nameTextField.getInputVerifier().verify(nameTextField) && addressUrlTextField.getInputVerifier().verify(addressUrlTextField));
            }
        });

        addressUrlTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                buttonOK.setEnabled(nameTextField.getInputVerifier().verify(nameTextField) && addressUrlTextField.getInputVerifier().verify(addressUrlTextField));
            }
        });

        buttonOK.addActionListener(e -> onOK());

        buttonCancel.addActionListener(e -> onCancel());

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(e -> onCancel(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        StringBuilder errorMessageBuilder = new StringBuilder();
        AddTypeScriptRefHandler.handleOk(
                this.module,
                this.addressUrlTextField.getText(),
                this.nameTextField.getText(),
                this.selectedDirectory,
                this.onlyTypeScriptDefinitionsCheckBox.isSelected(),
                errorMessageBuilder
        );
        if (errorMessageBuilder.toString().length() > 0) {
            errorTextPane.setText(errorMessageBuilder.toString());
            errorTextPane.setVisible(true);
        } else {
            dispose();
        }
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        AddTypeScriptRef dialog = new AddTypeScriptRef(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public String getSelectedDirectory() {
        return selectedDirectory;
    }

    public void setSelectedDirectory(String selectedDirectory) {
        this.selectedDirectory = selectedDirectory;
    }

    public String getInitialDtoName() {
        return this.nameTextField.getText();
    }

    public void setFileName(String initialDtoName) {
        this.nameTextField.setText(initialDtoName);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(4, 1, new Insets(10, 10, 10, 10), -1, -1));
        contentPane.setMaximumSize(new Dimension(700, 420));
        contentPane.setMinimumSize(new Dimension(400, 220));
        contentPane.setPreferredSize(new Dimension(550, 220));
        contentPane.setRequestFocusEnabled(false);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1, true, false));
        panel1.add(panel2, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buttonOK = new JButton();
        buttonOK.setText("OK");
        panel2.add(buttonOK, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonCancel = new JButton();
        buttonCancel.setText("Cancel");
        panel2.add(buttonCancel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        onlyTypeScriptDefinitionsCheckBox = new JCheckBox();
        onlyTypeScriptDefinitionsCheckBox.setSelected(false);
        onlyTypeScriptDefinitionsCheckBox.setText("Only TypeScript definitions");
        panel1.add(onlyTypeScriptDefinitionsCheckBox, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Address Url");
        panel3.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addressUrlTextField = new JTextField();
        addressUrlTextField.setToolTipText("eg, http://example.com/");
        panel3.add(addressUrlTextField, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Name");
        panel3.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameTextField = new JTextField();
        nameTextField.setText("");
        panel3.add(nameTextField, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setFocusable(false);
        contentPane.add(panel4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        infoTextPane = new JTextPane();
        infoTextPane.setEditable(false);
        infoTextPane.setFocusCycleRoot(false);
        infoTextPane.setFocusable(false);
        Font infoTextPaneFont = this.$$$getFont$$$("Arial", -1, -1, infoTextPane.getFont());
        if (infoTextPaneFont != null) infoTextPane.setFont(infoTextPaneFont);
        infoTextPane.setOpaque(false);
        infoTextPane.setRequestFocusEnabled(false);
        infoTextPane.setText("To generate the DTO Service Model types for a specific ServiceStack instance, enter the base URI for the remote ServiceStack server and click OK.");
        panel4.add(infoTextPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(150, 25), null, 0, false));
        errorTextPane = new JTextPane();
        errorTextPane.setEditable(false);
        errorTextPane.setFocusCycleRoot(false);
        errorTextPane.setFocusable(true);
        Font errorTextPaneFont = this.$$$getFont$$$("Arial", -1, -1, errorTextPane.getFont());
        if (errorTextPaneFont != null) errorTextPane.setFont(errorTextPaneFont);
        errorTextPane.setOpaque(false);
        errorTextPane.setVisible(false);
        panel4.add(errorTextPane, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(150, 25), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}
