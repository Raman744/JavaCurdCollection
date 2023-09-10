import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Main Started............");

        try {
            Connection connection = JdbcConnection.getConnection();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Choose Your Option : ");
                System.out.println("1. Insert ");
                System.out.println("2. Read ");
                System.out.println("3. Read by Id");
                System.out.println("4. Update ");
                System.out.println("5. Delete ");
                System.out.println("6. Exit ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        insertRecord(connection, scanner);
                        break;
                    case 2:

                        //
                        break;
                    case 3:

                        //
                        break;
                    case 4:

                        //
                        break;
                    case 5:

                        //
                        break;
                    case 6:

                        //
                        break;

                    default:
                        break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<PersonData> insertRecord(Connection connection, Scanner scanner) {

        List<PersonData> inserRecords = new ArrayList<>();
        String insertQuery = JdbcConnection.getInsertUserSQL();
        try {

            System.out.println("Enter Name : ");
            String name = scanner.next();

            System.out.println("Enter email : ");
            String email = scanner.next();
            // Validate email format
            if (!email.endsWith("@gmail.com")) {
                System.out.println("Email must end with @gmail.com.");
                return inserRecords;
            }

            System.out.println("Enter country : ");
            String country = scanner.next();

            System.out.println("Enter Phone Number : ");
            String phone = scanner.next();
            if (phone.length() != 10) {
                System.out.println("Phone number must be 10 digits long.");
                return inserRecords;
            }

            System.out.println("Enter JoinDate yyyy-MM-dd ");
            String joinDateStr = scanner.next();
            Date joinDate = new SimpleDateFormat("yyyy-MM-dd").parse(joinDateStr);

            System.out.println("Enter CompanyName : ");
            String companyname = scanner.next();

            System.out.println("Enter Password : ");
            String password = scanner.next();

            System.out.println("Enter UpdateJoin yyyy-MM-dd");
            String UpdateDateStr = scanner.next();
            Date UpdateJoin = new SimpleDateFormat("yyyy-MM-dd").parse(UpdateDateStr);

            PreparedStatement ps = connection.prepareStatement(insertQuery);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, country);
            ps.setString(4, phone);
            ps.setDate(5, new java.sql.Date(joinDate.getTime()));
            ps.setString(6, companyname);
            ps.setString(7, password);
            ps.setDate(8, new java.sql.Date(UpdateJoin.getTime()));
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully...............");
            } else {
                System.out.println("Failed to insert record.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return inserRecords;
    }
}
