
public class LogikaCesar {

    public static String encrypt(String message, int key) {

        StringBuilder sb = new StringBuilder(message);

        for (int i = 0; i < sb.length(); i++) {
            int c = (int) sb.charAt(i);
            if (c + key > 122) {
                c = 31 + (key - (122 - c));
            } else {
                c += key;
            }
            sb.setCharAt(i, (char) c);
        }

        return sb.toString();
    }

    public static String decode(String message, int key) {

        StringBuilder sb = new StringBuilder(message);

        for (int i = 0; i < sb.length(); i++) {
            int c = (int) sb.charAt(i);
            if (c - key < 32) {
                c = 123 - (key - (c - 32));
            } else {
                c -= key;
            }
            sb.setCharAt(i, (char) c);
        }

        return sb.toString();
    }

   
//C:\\Users\\patryk\\Desktop\\1.txt

}
