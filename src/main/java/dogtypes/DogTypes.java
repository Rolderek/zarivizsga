package dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    /*
    MariaDbDataSource dataSource;
        dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/dogs?useUnicode=true");
        dataSource.setUser("mrdog");
        dataSource.setPassword("mrdog");
     */
    private MariaDbDataSource dataSource;

    public DogTypes(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    private List<String> getDogs(PreparedStatement ps) throws SQLException {
        List<String> dogs = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String dogName = rs.getString(1).toLowerCase();
                dogs.add(dogName);
            }
        }
        return dogs;
    }

    public List<String> getDogsByCountry(String str) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select name from dog_types where country = ?;")) {

            ps.setString(1, str.toUpperCase());
            return getDogs(ps);

        } catch (SQLException se) {
            throw new IllegalStateException("Can not read database.", se);
        }
    }


}

