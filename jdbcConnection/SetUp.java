package jdbcConnection;

//1.Import
import  java.sql.*;
import java.util.Scanner;

public  class SetUp {

    private  static  final String url = "DB_URL";
    private  static  final String userName = "DB_USERNAME";
    private  static  final  String password = "DB_PASSWORD";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2.Load Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Create a connection
            Connection con = DriverManager.getConnection(url , userName , password);

            //4. Create Statement
           // Statement stm = con.createStatement();
            //Execute Query
//            String query = "INSERT INTO Class VALUES(1 , 'CodeVibes')";
//            String query = "DELETE FROM Class WHERE sid = 1 ";
//            String query = "UPDATE Class Set sid = 101 , sName = 'CodeVibes' WHERE sid = 1 ";
//            stm.executeUpdate(query);

            //Prepared Statement
//            PreparedStatement pstm = con.prepareStatement("INSERT INTO Class VALUES(?,?)");
//            System.out.println("How many Student you want to enter ?");
//            int num = sc.nextInt();
//            for(int i=1;i<=num;i++){
//                System.out.println("Enter id");
//                int id = sc.nextInt();
//                System.out.println("Enter name");
//                String name = sc.next();
//                pstm.setInt(1 , id);
//                pstm.setString(2 , name);
//                pstm.executeUpdate();
//            }

            //ResultNet
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM Class");
            ResultSet rs = pstm.executeQuery(); // Table ko ResultSet mai store krta hai
            while (rs.next()){ // check aage koi hai if yes true while loop run else false it stop
                int id = rs.getInt(1);// column name or column index
                String name = rs.getString(2);
                System.out.println("My id is "+id + " and Name is "+name);
            }

        }catch (Exception e){
            System.out.println(e);
        }


    }
}