public class TestAuthor {
    public static void main(String[] args) {
        // Test the constructor and toString()
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author[name = Tan Ah Teck, email = ahteck@nowhere.com, gender = m]

        // Test setter and getters
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName()); // name is: Tan Ah Teck
        System.out.println("email is: " + ahTeck.getEmail());   // email is: paulTan@nowhere.com
        System.out.println("gender is: " + ahTeck.getGender()); // gender is: m
    }
}
