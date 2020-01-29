

import java.sql.*;

public class Main {
    public static void main(String[] args) {


        Thread thread1 = new Thread(){
            @Override
            public void run() {
                try{
                    Person person = new PersonBuilder().setId("1").setFullname("sina ghiasi").createPerson();
                    Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","sina","sg159753");
                    PreparedStatement preparedStatement = connection.prepareStatement("insert into Persons(nationalID,name) values (?,?)");
                    preparedStatement.setString(1,person.getId());
                    preparedStatement.setString(2,person.getFullname());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    System.out.println("insert completed");
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","sina","sg159753");
                    PreparedStatement preparedStatement = connection.prepareStatement("select * from Persons where nationalID = ?");
                    preparedStatement.setString(1,"1");
                    ResultSet resultSet =preparedStatement.executeQuery();
                    if(resultSet.next()){
                        Swing frame =new Swing(new PersonBuilder().setId(resultSet.getString("nationalID")).setFullname(resultSet.getString("name")).createPerson());
                        frame.initial();
                        frame.setVisible(true);
                    }
                    preparedStatement.close();
                    connection.close();
                    System.out.println("swing completed");
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                try{
                    Person person = new PersonBuilder().setId("1").setFullname("mahan ziari").createPerson();
                    Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","sina","sg159753");
                    PreparedStatement preparedStatement = connection.prepareStatement("update Persons set name=? where nationalID=?");
                    preparedStatement.setString(1,person.getFullname());
                    preparedStatement.setString(2,person.getId());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    System.out.println("update completed");
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }
        };


        thread1.setPriority(10);
        thread2.setPriority(10);
        thread3.setPriority(1);
        thread1.start();
        thread2.start();
        while (!thread2.isAlive()){

            try {
                thread3.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
