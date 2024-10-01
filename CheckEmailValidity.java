package trying;
// How can we modify the validation to support multiple valid email domains (e.g., "@gmail.com", "@yahoo.com")?

public class CheckEmailValidity {

    // Private field to store email once it is validated
    private String email;

    // Setter method to set the email after validation
    public void setEmail(String email) {

        // Call the method to check the validity of the email
        String validationMessage = checkVlidity(email);

        // If validation is successful, store the email
        if (validationMessage.equals("Email successfully set")) {
            this.email = email;  // Set the email only if it's valid
        }

        // Print the validation message (either success or error)
        System.out.println(validationMessage);
    }

    // Method to check if the email is valid (must end with "@gmail.com")
    public String checkVlidity(String email) {

        String emailDomain = "@gmail.com";  // The valid domain
        int domainIndex = email.indexOf(emailDomain);  // Check where the domain appears in the string

        // Ensure the domain exists and is at the end of the email
        if (domainIndex != -1 && email.length() - emailDomain.length() == domainIndex) {
            return "Email successfully set";  // Email is valid
        } else {
            return "Invalid input. Please use an email ending with @gmail.com";  // Invalid email message
        }
    }

    // Getter method to retrieve the email (returns null if the email was never set)
    public String getEmail() {
        return this.email;
    }
}
