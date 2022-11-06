
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.util.Properties;

public class DatabaseHanler extends Config {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException
    {
        String connectionString = "jdbc:mysql://" + dbHost+":"+dbPort+"/"+dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection=DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    //Write
    public void writeApp(String repairMan,int deadLine,int request)
    {
        String insert = "INSERT INTO " + Const.BASE_TABLE
                + "(" + Const.BASES_REQUEST_NUMBER + "," + Const.BASES_REPAIR_MAN
                + "," + Const.BASES_DEADLINE+")"+"VALUES(?,?,?)";
        try {
        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setInt(1, request);
        prSt.setString(2, repairMan);
        prSt.setInt(3, deadLine);
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
