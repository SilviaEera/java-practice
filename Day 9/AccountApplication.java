import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    String AccountName;
    String AccountNumber;
    int Balance;

    public Account() {
    }

    public Account(String AccountName, String AccountNumber, int Balance) {
        this.AccountName = AccountName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String toString() {
        return "Account Name: " + AccountName + " Account Number: " + AccountNumber + " Available Balance: " + Balance;
    }
}

public class AccountApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = null;

        HashMap<String, Account> hm = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                account = (Account) ois.readObject();
                System.out.println(account);
                hm.put(account.AccountNumber, account);

            }
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileOutputStream fos = new FileOutputStream("Account.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int choice;
            String AccountName, AccountNumber;
            int Balance;
            System.out.println("Menu");

            do {
                System.out.println("1. Create Account.");
                System.out.println("2. Delete Account.");
                System.out.println("3. view Account.");
                System.out.println("4. View All Account.");
                System.out.println("5. Save Accounts.");
                System.out.println("Enter your choice ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Account Number, Account Name, Balance please....");
                        AccountName = sc.nextLine();
                        AccountNumber = sc.nextLine();
                        Balance = sc.nextInt();

                        account = new Account(AccountName, AccountNumber, Balance);
                        hm.put(AccountNumber, account);
                        System.out.println("Account Created for " + AccountName);
                        break;

                    case 2:

                        System.out.println("Enter Account Number of account you want to delete: ");

                        AccountNumber = sc.nextLine();

                        hm.remove(AccountNumber);

                        break;

                    case 3:
                        System.out.println("enter account number to view the details of account: ");
                        AccountNumber = sc.nextLine();
                        account = hm.get(AccountNumber);

                        System.out.println(account);
                        break;
                    case 4:
                        for (Account a : hm.values()) {
                            System.out.println(a);
                        }
                        break;
                    case 5:
                    case 6:
                        oos.writeInt(hm.size());
                        for (Account a : hm.values()) {
                            oos.writeObject(a);
                        }

                }
            } while (choice != 5);
            oos.close();
            fos.close();
            oos.flush();
            fos.flush();
            System.out.flush();
        } catch (Exception e) {

        }

    }
}
