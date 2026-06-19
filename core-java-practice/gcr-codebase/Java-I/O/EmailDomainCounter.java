import java.io.*;
import java.util.HashMap;

public class EmailDomainCounter {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                String domain =
                        email.substring(email.indexOf("@") + 1);

                map.put(domain,
                        map.getOrDefault(domain, 0) + 1);
            }

            br.close();

            for (String domain : map.keySet()) {
                System.out.println(domain +
                        " -> " + map.get(domain));
            }

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}