package co.edu.co.login.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL= "jdbc:mysql://aws.connect.psdb.cloud/afhc?sslMode=VERIFICAR_IDENTIDAD";

    private static final  String USER="aw5onxj84ghoupr068w4";
    private static final  String PASS="pscale_pw_FA1ryJrgS2QvMjwJCyYPghhbyJhq5TMKp9JxdZkn3JW";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException{
        if (pool==null){

            pool=new BasicDataSource();
            pool.setUrl(URL);
            pool.setUrl(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);

        }
        return pool;


    }// getConnectionToDatabase
    public  static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }


}
