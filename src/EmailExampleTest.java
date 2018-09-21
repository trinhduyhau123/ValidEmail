public class EmailExampleTest {

    private static EmailExample emailExample;
    private static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean valid = emailExample.validate(email);
            System.out.println("Email "+ email + "is valid: "+valid);
        }

        for (String email : invalidEmail) {
            boolean invalid = emailExample.validate(email);
            System.out.println("Email "+ email +"is valid: "+invalid);
        }
    }
}
