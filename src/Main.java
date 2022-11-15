

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Saada", 2334, 493031200);

        System.out.println(client.getName());
        System.out.println(client.getBalance());
        System.out.println(client.getPersonalCode());
        System.out.println(client.difference(34,53));
        System.out.println(client.sayTere("Tere"));
    }
}