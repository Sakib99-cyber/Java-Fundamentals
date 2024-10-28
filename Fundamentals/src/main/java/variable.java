public class variable {
    public static void main(String[] args) {
       /* var message = "Hello World";
        var extra = "I love to code";
       */
       // String message ="Hello World!";
       // String extra = "I love to code";

        String message ="Hello World!";
        String extra = "I love to code";

        System.out.println(message + " " + extra);
        System.out.println( "Length of" + message + " is " + message.length() );
        System.out.println( "Upper Case Version of" + message + " is " + message.toUpperCase() );
        System.out.println( "Lower Case Version of" + message + " is " + message.toLowerCase() );

        String combo = message + " " + extra;
        System.out.println("combo: " + combo);

        String upperVersion = combo.toUpperCase();
        System.out.println("upperVersion: " + upperVersion);

        String lowerVersion = combo.toLowerCase();
        System.out.println("lowerVersion: " + lowerVersion);
    }
}
