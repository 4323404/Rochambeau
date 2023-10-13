import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SaveUserInfo extends JFrame {
    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton saveButton;

    public SaveUserInfo() {
        super("Save User Info");
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(50, 50, 50, 50);

        
        JLabel usernameLabel = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        
        usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(usernameField, constraints);

        
        JLabel emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(emailLabel, constraints);

        
        emailField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(emailField, constraints);

        
        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(passwordLabel, constraints);

        
        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(passwordField, constraints);

       
        saveButton = new JButton("Save");
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(saveButton, constraints);

        
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                
                try {
                    
                    File file = new File("/Users/ofentsemasia/interface.java/src/userinfo");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(username + "\n");
                    fileWriter.write(email + "\n");
                    fileWriter.write(password + "\n");
                    fileWriter.close();
                   
                    JOptionPane.showMessageDialog(SaveUserInfo.this, "Save successful, lets Rochembau!");
                } catch (IOException ex) {
                   
                    JOptionPane.showMessageDialog(SaveUserInfo.this, "Error saving user info: " + ex.getMessage());
                }
            }
        });

        
        pack();
    }

    public static void main(String[] args) {
       
        SaveUserInfo frame = new SaveUserInfo();
        
        frame.setVisible(true);
    }
}
